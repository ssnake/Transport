package com.zxc;

import java.util.Vector;

/**
 * Created by snake on 12/7/13.
 * TransportRoute class
 */
public class TransportRoute {


    public class Point {


        Float x;
        Float y;

        public Vector2d<Float> toVector2d()
        {
            return new Vector2d<Float>(x, y);

        }
        public Float getY() {
            return y;
        }

        public void setY(Float y) {
            this.y = y;
        }


        public Float getX() {
            return x;
        }

        public void setX(Float x) {
            this.x = x;
        }

        public Point(Float x, Float y)
        {
            this.x = x;
            this.y = y;
        }
    }

    Vector<Point> data;
    String name;

    public Float getLength() {
        if (data.size() > 0)
            return getDistanceBetweenPoints(0, data.size() - 1);
        else
            return  0.0f;
    }
    public Float getDistanceBetweenPoints(int index1, int index2)
    {
        Float ret = 0.0f;
        Point prev_p = null;
        while(index1<= index2)
        {
            Point p = data.get(index1);
            if (prev_p != null)
            {
                ret += TransportMath.getDistance(prev_p.toVector2d(), p.toVector2d());

            }
            index1++;
            prev_p = p;

        }
        return ret;
    }
    public Point findNearestPoint(Vector2d<Float> p)
    {
        return new Point(0.0f, 0.0f);

    }
    public Float getDistance(Vector2d<Float> p1, Vector2d<Float> p2)
    {
        return 0.0f;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*  consturctors */
    public TransportRoute(String name)
    {
        this();
        this.name = name;
    }
    public TransportRoute()
    {
        this.data = new Vector<Point>();

    }

    public Point add(Float x, Float y)
    {
        return add(new Point(x, y));

    }
    public Point add(Point p)
    {
        data.add(p);
        return p;
    }
}

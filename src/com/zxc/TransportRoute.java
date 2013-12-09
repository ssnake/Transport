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

        public boolean equals(Object obj)
        {
            return (this.x == ((Point) obj).getX() ) && (this.y == ((Point) obj).getY());

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
    public Float getDistanceBetweenPoints(Point p1, Point p2)
    {
        int i1 = data.indexOf(p1);
        int i2 = data.indexOf(p2);
        return getDistanceBetweenPoints(i1, i2);

    }

    public Point findNearestPoint(Vector2d<Float> p)
    {
        Float l = Float.MAX_VALUE;
        Point ret_p = null;
        for(Point dp: data)
        {
            Float temp_l = TransportMath.getDistance(dp.toVector2d(), p);
            if (temp_l < l)
            {
                ret_p = dp;
                l = temp_l;
            }
        }
        return ret_p;

    }
    public Float getDistance(Vector2d<Float> p1, Vector2d<Float> p2)
    {
        Point dp1 = findNearestPoint(p1);
        Point dp2 = findNearestPoint(p2);


        return getDistanceBetweenPoints(dp1, dp2);
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
    public Point get(int index)
    {
        return data.get(index);
    }
}

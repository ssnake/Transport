package com.zxc;

import java.util.Vector;
import com.zxc.Vector2d;

/**
 * Created by snake on 05.12.13.
 */

 public class TransportMath {

    public static Float GetSectionEqualA(Vector2d<Float> p1, Vector2d<Float> p2)
    {
        return p2.getY()-p1.getY();

    }
    public static Float GetSectionEqualB(Vector2d<Float> p1, Vector2d<Float> p2)
    {
        return p1.getX() - p2.getX();
    }
    public static Float GetSectionEqualC(Vector2d<Float> p1, Vector2d<Float> p2)
    {

        return (p2.getX() - p1.getX())*p1.getY() + p1.getX()*(p1.getY() - p2.getY());
    }
    public static Vector2d<Float> GetPointOnSection(Vector2d<Float> p, Float a, Float b, Float c)
    {
        return new Vector2d<Float>(0.0f,0.0f);
    }
}

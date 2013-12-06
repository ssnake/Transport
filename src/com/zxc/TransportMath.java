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
    public static Vector2d<Float> FindXYByCramer(Float a1, Float b1, Float c1, Float a2, Float b2, Float c2 )
    {
        //using Cramer rule http://en.wikipedia.org/wiki/Cramer%27s_rule
        Float x = (-c1 * b2 + b1* c2)/(a1 * b2 - b1 * a2);
        Float y = (-a1 * c2 + c1 * a2)/(a1 * b2 - b1 * a2);
        return new Vector2d<Float>(x,y);
    }
    public static Vector2d<Float> GetPointOnSection(Vector2d<Float> p, Float a, Float b, Float c)
    {
        Float na = b;
        Float nb = -a;
        Float nc = -nb * p.getY() - na * p.getX();
        return FindXYByCramer(a, b, c, na, nb, nc);

    }

    public static Vector2d<Float> GetPointOnSection(Vector2d<Float> sectionP1, Vector2d<Float> sectionP2, Vector2d<Float> m)
    {
        Float a = GetSectionEqualA(sectionP1, sectionP2);
        Float b = GetSectionEqualB(sectionP1, sectionP2);
        Float c = GetSectionEqualC(sectionP1, sectionP2);

        return GetPointOnSection(m, a, b, c );

    }
}

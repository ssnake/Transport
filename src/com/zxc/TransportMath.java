package com.zxc;

import java.util.Vector;

/**
 * Created by snake on 05.12.13.
 */

public class TransportMath {
    public static Float GetSectionEqualA(Vector<Float> p1, Vector<Float> p2)
    {
        return p2.get(1)-p1.get(1);

    }
    public static Float GetSectionEqualB(Vector<Float> p1, Vector<Float> p2)
    {
        return p1.get(0) - p2.get(0);
    }
    public static Float GetSectionEqualC(Vector<Float> p1, Vector<Float> p2)
    {

        return (p2.get(0) - p1.get(0))*p1.get(1) + p1.get(0)*(p1.get(1) - p2.get(1));
    }
}

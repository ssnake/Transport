package com.zxc.test;

import com.zxc.TransportRoute;
import com.zxc.Vector2d;
import junit.framework.TestCase;

/**
 * Created by snake on 12/7/13.
 */
public class TransportRouteTest extends TestCase {
    public void test1()
    {
        TransportRoute r = new TransportRoute("route1");
        assertEquals("route1", r.getName());
        TransportRoute.Point p = r.add(1.0f, 2.0f);
        assertEquals(1.0f, p.getX());
    }
    public void testGetLength()
    {
        TransportRoute r = new TransportRoute();
        r.add(0.0f, 0.0f);
        r.add(0.0f, 1.0f);
        assertEquals(1.0f, r.getLength());
    }
    public void testGetLength2()
    {
        TransportRoute r = new TransportRoute();
        for(int i =0; i<10; i++)
        {
            r.add(0.0f, (float) i);
        }
        assertEquals(9.0f, r.getLength());
    }
    //disabled so far
    public void XtestGetLength3()
    {
        TransportRoute r = new TransportRoute();
        r.add(0.0f, 0.0f);
        r.add(3.0f, 0.0f);
        r.add(1.0f, 0.0f);

        assertEquals(2.0f, r.getLength());
    }
    public void testGetLength4()
    {
        TransportRoute r = new TransportRoute();
        r.add(0.0f, 0.0f);
        r.add(0.0f, 2.0f);
        r.add(2.0f, 2.0f);
        r.add(2.0f, 0.0f);
        r.add(0.0f, 0.0f);

        assertEquals(8.0f, r.getLength());
    }
    public void testGetDistanceBetweenPoints()
    {
        TransportRoute r = new TransportRoute();
        r.add(0.0f, 0.0f);
        r.add(10.0f, 0.0f);

        Float dist =
            r.getDistance(
                new Vector2d<Float>(1.0f, 0.0f),
                new Vector2d<Float>(5.0f, 0.0f));
        assertEquals(4.0f, dist);
    }
    public static void main(String args[])
    {
        junit.textui.TestRunner.run(TransportRouteTest.class);
    }
}

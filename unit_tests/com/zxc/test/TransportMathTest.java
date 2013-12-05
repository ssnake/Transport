package com.zxc.test;
import com.zxc.TransportMath;
import junit.framework.TestCase;
import com.zxc.Vector2d;


import java.util.Vector;

/**
 * Created by snake on 05.12.13.
 */
public class TransportMathTest extends TestCase {
    public void testTask1()
    {

        Vector2d<Float> p1 = new Vector2d<Float>(1.0f, 1.0f);
        Vector2d<Float> p2 = new Vector2d<Float>(4.0f, 2.0f);


        Float A = TransportMath.GetSectionEqualA(p1, p2);
        Float B = TransportMath.GetSectionEqualB(p1, p2);
        Float C = TransportMath.GetSectionEqualC(p1, p2);
        assertEquals(1.0f, A);
        assertEquals(-3.0f,B);
        assertEquals(2.0f,C);
    }
    public void testFindPoint()
    {
        Float A = 4.0f;
        Float B = -3.0f;
        Float C = 35.0f;
        Vector2d<Float> M = new Vector2d<Float>(-1.0f, 2.0f);
        Vector2d<Float> H = TransportMath.GetPointOnSection(M, A, B, C);
        assertEquals(-5.0f, H.getX() );
        assertEquals(5.0f, H.getY() );
    }

    protected void setUp() throws java.lang.Exception
    {
    /* compiled code */
    }

    protected void tearDown() throws java.lang.Exception
    { /* compiled code */
    }
    public static void main(String args[])
    {
        junit.textui.TestRunner.run(TransportMathTest.class);
    }
}

package com.zxc.test;
import com.zxc.TransportMath;
import junit.framework.TestCase;

import java.util.Vector;

/**
 * Created by snake on 05.12.13.
 */
public class TransportMathTest extends TestCase {
    public void testTask1()
    {
        Vector<Float> p1 = new Vector<Float>();
        Vector<Float> p2 = new Vector<Float>();
        p1.add(1.0f);
        p1.add(1.0f);

        p2.add(4.0f);
        p2.add(2.0f);


        Float A = TransportMath.GetSectionEqualA(p1, p2);
        Float B = TransportMath.GetSectionEqualB(p1, p2);
        Float C = TransportMath.GetSectionEqualC(p1, p2);
        assertEquals(1.0f,A);
        assertEquals(-3.0f,B);
        assertEquals(2.0f,C);
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

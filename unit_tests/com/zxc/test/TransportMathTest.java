package com.zxc.test;
import com.zxc.TransportMath;
import junit.framework.TestCase;
import com.zxc.Vector2d;

/**
 * Created by snake on 05.12.13.
 */
public class TransportMathTest extends TestCase {
    public void testFindABC()
    {

        Vector2d<Float> p1 = new Vector2d<Float>(1.0f, 1.0f);
        Vector2d<Float> p2 = new Vector2d<Float>(4.0f, 2.0f);


        Float A = TransportMath.getSectionEqualA(p1, p2);
        Float B = TransportMath.getSectionEqualB(p1, p2);
        Float C = TransportMath.getSectionEqualC(p1, p2);
        assertEquals(1.0f, A);
        assertEquals(-3.0f ,B);
        assertEquals(2.0f, C);
    }
    public void testFindABC2()
    {
        Vector2d<Float> p1 = new Vector2d<Float>(-7.0f, -5.0f);
        Vector2d<Float> p2 = new Vector2d<Float>(2.0f, 1.0f);
        assertEquals(6.0f, TransportMath.getSectionEqualA(p1, p2));
        assertEquals(-9.0f, TransportMath.getSectionEqualB(p1, p2));


    }
    public void testFindABC3()
    {
        Vector2d<Float> p1 = new Vector2d<Float>(0.0f, -1.0f);
        Vector2d<Float> p2 = new Vector2d<Float>(1.0f, 0.0f);
        assertEquals(1.0f, TransportMath.getSectionEqualA(p1, p2));
        assertEquals(-1.0f, TransportMath.getSectionEqualB(p1, p2));
        assertEquals(-1.0f, TransportMath.getSectionEqualC(p1, p2));


    }
    public void testFindPoint()
    {
        Float A = 4.0f;
        Float B = -3.0f;
        Float C = 35.0f;
        Vector2d<Float> M = new Vector2d<Float>(-1.0f, 2.0f);
        Vector2d<Float> H = TransportMath.getPointOnSection(M, A, B, C);
        assertEquals(-5.0f, H.getX() );
        assertEquals(5.0f, H.getY() );




    }
    public void testFindPoint2()
    {
        Vector2d<Float> P1 = new Vector2d<Float>(0.0f, 0.0f);
        Vector2d<Float> P2 = new Vector2d<Float>(1.0f, 0.0f);
        Vector2d<Float> M = new Vector2d<Float>(2.0f, 2.0f);

        Vector2d<Float> H = TransportMath.getPointOnSection(P2, P1, M);
        assertEquals(2.0f, H.getX() );
        assert((new Float(0.0f)).equals(H.getY()));

    }
    public void testFindPoint3()
    {
        Vector2d<Float> P1 = new Vector2d<Float>(0.0f, -1.0f);
        Vector2d<Float> P2 = new Vector2d<Float>(1.0f, 0.0f);
        Vector2d<Float> M = new Vector2d<Float>(1.0f, 2.0f);

        Vector2d<Float> H = TransportMath.getPointOnSection(P2, P1, M);
        assertEquals(2.0f, H.getX() );
        assertEquals(1.0f, H.getY() );

    }
    public void testFindPoint4()
    {
        Vector2d<Float> P1 = new Vector2d<Float>(0.0f, 0.0f);
        Vector2d<Float> P2 = new Vector2d<Float>(1.0f, 0.0f);
        Vector2d<Float> M = new Vector2d<Float>(-1.0f, -2.0f);

        Vector2d<Float> H = TransportMath.getPointOnSection(P2, P1, M);
        assertEquals(-1.0f, H.getX() );
        assert((new Float(0.0f)).equals(H.getY()));

    }

    public void testFindPoint5()
    {
        Vector2d<Float> P1 = new Vector2d<Float>(0.0f, 0.0f);
        Vector2d<Float> P2 = new Vector2d<Float>(1.0f, 0.0f);
        Vector2d<Float> M = new Vector2d<Float>(1.0f, -2.0f);

        Vector2d<Float> H = TransportMath.getPointOnSection(P2, P1, M);
        assertEquals(1.0f, H.getX() );
        assert((new Float(0.0f)).equals(H.getY()));

    }
    public void testFindPoint6()
    {
        Vector2d<Float> P1 = new Vector2d<Float>(0.0f, 0.0f);
        Vector2d<Float> P2 = new Vector2d<Float>(1.0f, 0.0f);
        Vector2d<Float> M = new Vector2d<Float>(-1.0f, 2.0f);

        Vector2d<Float> H = TransportMath.getPointOnSection(P2, P1, M);
        assert((new Float(-1.0f)).equals(H.getX()));
        assert((new Float(0.0f)).equals(H.getY()));


    }
    public void testGetDistance()
    {
        Vector2d<Float> p1 = new Vector2d<Float>(1.0f, 1.0f);
        Vector2d<Float> p2 = new Vector2d<Float>(2.0f, 2.0f);
        Float res = TransportMath.getDistance(p1, p2);
        assert(new Float(Math.sqrt(2.0f)).equals(res));

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

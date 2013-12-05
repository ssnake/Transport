package com.zxc.test;
import com.zxc.TransportManager;
import junit.framework.TestCase;

public class TransportManagerTest extends TestCase

{
    public void testHello()
    {
        TransportManager m = new TransportManager();
        assertEquals("", m.test());

    }

    public static void main(String args[])
    {
        junit.textui.TestRunner.run(TransportManagerTest.class);
    }
}

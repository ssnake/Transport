package com.zxc;

import java.util.Vector;

/**
 * Created by snake on 05.12.13.
 */

public class Vector2d<E>{
    private Vector<E> vector;
    public Vector2d(E x, E y)
    {
        vector = new Vector<E>();
        vector.add(x);
        vector.add(y);
    }
    public E getX()
    {
        return vector.get(0);
    }
    public E getY()
    {
        return vector.get(1);
    }
}

package org.tlh.nasa.test;

import org.junit.Test;
import org.tlh.nasa.enums.DirectionEnum;

import static org.junit.Assert.assertEquals;
import static org.tlh.nasa.enums.DirectionEnum.*;

public class DirectionTest {

    @Test
    public void north(){
        DirectionEnum north = N;
        assertEquals(W,north.left());
        assertEquals(E,north.right());
    }

    @Test
    public void east(){
        DirectionEnum east = E;
        assertEquals(N,east.left());
        assertEquals(S,east.right());
    }

    @Test
    public void south(){
        DirectionEnum south = S;
        assertEquals(E,south.left());
        assertEquals(W,south.right());
    }

    @Test
    public void west(){
        DirectionEnum west = W;
        assertEquals(S,west.left());
        assertEquals(N,west.right());
    }

}

package org.tlh.nasa.test;

import org.junit.Test;
import org.tlh.nasa.enums.DirectionEnum;

import static org.junit.Assert.assertEquals;
import static org.tlh.nasa.enums.DirectionEnum.*;

public class DirectionTest {

    @Test
    public void north(){
        DirectionEnum north = NORTH;
        assertEquals(WEST,north.left());
        assertEquals(EAST,north.right());
    }

    @Test
    public void east(){
        DirectionEnum east = EAST;
        assertEquals(NORTH,east.left());
        assertEquals(SOUTH,east.right());
    }

    @Test
    public void south(){
        DirectionEnum south = SOUTH;
        assertEquals(EAST,south.left());
        assertEquals(WEST,south.right());
    }

    @Test
    public void west(){
        DirectionEnum west = WEST;
        assertEquals(SOUTH,west.left());
        assertEquals(NORTH,west.right());
    }

}

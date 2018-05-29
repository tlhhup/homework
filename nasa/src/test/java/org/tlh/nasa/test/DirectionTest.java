package org.tlh.nasa.test;

import org.junit.Test;
import org.tlh.nasa.enums.DirectionEnum;

import static org.tlh.nasa.enums.DirectionEnum.*;

public class DirectionTest {

    @Test
    public void north(){
        DirectionEnum north = NORTH;
        System.out.println(north.left());
        System.out.println(north.right());
    }

    @Test
    public void east(){
        DirectionEnum east = EAST;
        System.out.println(east.left());
        System.out.println(east.right());
    }

    @Test
    public void south(){
        DirectionEnum south = SOUTH;
        System.out.println(south.left());
        System.out.println(south.right());
    }

    @Test
    public void west(){
        DirectionEnum west = WEST;
        System.out.println(west.left());
        System.out.println(west.right());
    }

}

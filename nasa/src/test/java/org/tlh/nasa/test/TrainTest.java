package org.tlh.nasa.test;

import org.junit.Test;
import org.tlh.nasa.entity.Train;
import org.tlh.nasa.enums.DirectionEnum;
import static org.junit.Assert.assertEquals;

public class TrainTest {

    @Test
    public void move1(){
        Train train=new Train(1,2);
        String commands="LMLMLMLMM";
        for (int i=0;i<commands.length();i++){
            train.move(commands.charAt(i));
        }
        assertEquals(train,new Train(1,3,DirectionEnum.N));
    }

    @Test
    public void move2(){
        Train train=new Train(3,3);
        train.setDirection(DirectionEnum.E);
        String commands="MMRMMRMRRM";
        for (int i=0;i<commands.length();i++){
            train.move(commands.charAt(i));
        }
        assertEquals(train,new Train(5,1,DirectionEnum.E));
    }

}

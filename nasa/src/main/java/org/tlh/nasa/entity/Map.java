package org.tlh.nasa.entity;

import lombok.Data;

import java.util.List;

/**
 * 地图
 */
@Data
public class Map {

    private int x;
    private int y;
    private List<Train> trains;//存储所有的火星车

    public void start(){
        for (Train train:trains){
            //设置该车移动
            train.setMoving(true);
            while (train.isMoving()){
            }
        }
    }


}

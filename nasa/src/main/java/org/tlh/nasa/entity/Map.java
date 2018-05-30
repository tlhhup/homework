package org.tlh.nasa.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 地图
 */
@Data
public class Map {

    private int x;
    private int y;
    private List<Train> trains;//存储所有的火星车

    public Map() {
        this.trains = new ArrayList<Train>();
    }

    public void addTrain(Train train) {
        this.trains.add(train);
    }

    public void start() {
        for (Train train : trains) {
            // get commands
            String commands = train.getCommands();
            for (int i = 0; i < commands.length(); i++) {
                // out of range
                if (!outOfRange(train.getX(), train.getY())) {
                    train.move(commands.charAt(i));
                }
            }
        }
    }

    public boolean outOfRange(int x, int y) {
        if ((x >= 0 && x <= this.x) && (y >= 0 && y <= this.y)) {
            return false;
        } else {
            return true;
        }
    }

}
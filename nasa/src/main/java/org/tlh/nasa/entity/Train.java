package org.tlh.nasa.entity;

import lombok.Data;
import org.tlh.nasa.enums.DirectionEnum;

/**
 * 火车类
 */
@Data
public class Train {

    private int x;
    private int y;
    private DirectionEnum direction = DirectionEnum.NORTH;
    private boolean moving;

    public Train() {
    }

    public Train(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(char command) {
        //1.先判定是否是转弯
        if (command == 'L') {//左转
            this.direction = this.direction.left();
        }
        if (command == 'R') {
            this.direction = this.direction.right();
        }
        //2.移动
        if (command == 'M') {
            switch (direction) {
                case NORTH:
                    this.y++;
                    break;
                case EAST:
                    this.x++;
                    break;
                case SOUTH:
                    this.y--;
                    break;
                case WEST:
                    this.x--;
                    break;
            }
        }
    }

}
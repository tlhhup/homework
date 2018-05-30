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
    private DirectionEnum direction = DirectionEnum.N;
    private String commands;

    public Train() {
    }

    public Train(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Train(int x, int y, DirectionEnum direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
                case N:
                    this.y++;
                    break;
                case E:
                    this.x++;
                    break;
                case S:
                    this.y--;
                    break;
                case W:
                    this.x--;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
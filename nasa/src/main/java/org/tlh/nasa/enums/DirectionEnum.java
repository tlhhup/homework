package org.tlh.nasa.enums;

/**
 * 方向枚举
 */
public enum DirectionEnum {

    N, E, S, W;

    public DirectionEnum left() {
        int ordinal = this.ordinal();
        ordinal--;
        if (ordinal < 0) {
            ordinal += 4;
        }
        return findByOrdinal(ordinal);
    }

    public DirectionEnum right() {
        int ordinal = this.ordinal();
        ordinal++;
        ordinal %= 4;
        return findByOrdinal(ordinal);
    }

    private DirectionEnum findByOrdinal(int ordinal) {
        DirectionEnum direction = null;
        DirectionEnum[] values = values();
        for (DirectionEnum value : values) {
            if (value.ordinal() == ordinal) {
                direction = value;
                break;
            }
        }
        return direction;
    }

}

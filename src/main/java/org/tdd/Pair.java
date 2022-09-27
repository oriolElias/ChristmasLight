package org.tdd;

public class Pair {
    Coordinate upperLeft;
    Coordinate downRight;

    public Pair() {
    }

    public Pair(Coordinate upperLeft, Coordinate downRight) {
        this.upperLeft = upperLeft;
        this.downRight = downRight;
    }

    public Coordinate getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Coordinate upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Coordinate getDownRight() {
        return downRight;
    }

    public void setDownRight(Coordinate downRight) {
        this.downRight = downRight;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "upperLeft=" + upperLeft +
                ", downRight=" + downRight +
                '}';
    }
}

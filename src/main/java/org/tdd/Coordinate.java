package org.tdd;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {
    }

    public int getColumn() {
        return x;
    }

    public void setColumn(int x) {
        this.x = x;
    }

    public int getRow() {
        return y;
    }

    public void setRow(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

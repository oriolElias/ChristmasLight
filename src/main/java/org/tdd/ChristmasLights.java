package org.tdd;

public class ChristmasLights {
    int[][] lights;
    int columns = 1000;
    int rows = 1000;
    public ChristmasLights() {
        lights = new int[columns][rows];
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                lights[column][row]=0;
            }
        }
    }

    public int[][] turnOnLight(Coordinate coordinate,int turnValue) {
        lights[coordinate.getColumn()][coordinate.getRow()]=turnValue;
        return lights;
    }
}

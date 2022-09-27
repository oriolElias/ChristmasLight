package org.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ChristmasLightsTest {

    ChristmasLights christmasLights;
    int columns = 1000;
    int rows = 1000;
    @BeforeEach
    void setUpChristmasLights(){
        christmasLights = new ChristmasLights();
    }

    @Test
    void turnOnOneLight(){
        Coordinate coordinate = new Coordinate(0,0);
        int[][] actual = christmasLights.turnOnLight(coordinate,1);
        int[][] expected = new int[columns][rows];


        assertArrayEquals(turnOnLight(expected,coordinate,1),actual);

    }

    int[][] turnOnLight(int[][] expected,Coordinate coordinate, int turnValue){
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                expected[column][row]=0;
            }
        }
        expected[coordinate.getColumn()][coordinate.getRow()]=turnValue;
        return expected;
    }
}
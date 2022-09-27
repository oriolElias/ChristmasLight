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
    void turnOnAllLights(){
        Coordinate coordinate = new Coordinate(0,0);
        Pair coordinates = new Pair(new Coordinate(0,0),new Coordinate(999,999));

        int[][] actual = christmasLights.turnOnLight(coordinates,1);
        int[][] expected = new int[columns][rows];

        assertArrayEquals(turnOnLights(expected,coordinates,1),actual);

    }

    int[][] turnOnLights(int[][] expected,Pair coordinates, int turnValue){
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                expected[column][row]=0;
            }
        }
        int upperLeftColumn = coordinates.getUpperLeft().getColumn();
        int upperLeftRow = coordinates.getUpperLeft().getRow();
        int downRightColumn = coordinates.getDownRight().getColumn();
        int downRightRow = coordinates.getDownRight().getRow();

        for (int column = upperLeftColumn; column < downRightColumn; column++) {
            for (int row = upperLeftRow; row < downRightRow; row++) {
                expected[column][row]=turnValue;
            }
        }


        return expected;
    }
}
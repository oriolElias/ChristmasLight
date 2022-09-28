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
        Pair coordinates = new Pair(new Coordinate(0,0),new Coordinate(999,999));

        int[][] actual = christmasLights.turnLight(coordinates,1);
        int[][] expected = new int[columns][rows];

        assertArrayEquals(turnLights(expected,coordinates,1),actual);

    }

    @Test
    void toggleTheFirstLine(){
        Pair coordinates = new Pair(new Coordinate(0,0),new Coordinate(999,999));
        int[][] expected = new int[columns][rows];
        expected = turnLights(expected,coordinates,1);

        int[][] actual = new int[columns][rows];
        actual = christmasLights.turnLight(coordinates,1);

        coordinates = new Pair(new Coordinate(0,0),new Coordinate(999,0));
        expected = toggleLights(expected,coordinates);


        actual = christmasLights.toggle(coordinates);
        /*
        for (int col = 0; col < 1000; col++) {
            for (int row = 0; row < 1000; row++) {
                System.out.print(actual[col][row] + " ");
            }
            System.out.println("");
        }
        */
        assertArrayEquals(expected,actual);

    }

    int[][] toggleLights(int[][] expected,Pair coordinates){
        int upperLeftColumn = coordinates.getUpperLeft().getColumn();
        int upperLeftRow = coordinates.getUpperLeft().getRow();
        int downRightColumn = coordinates.getDownRight().getColumn();
        int downRightRow = coordinates.getDownRight().getRow();

        for (int column = upperLeftColumn; column <= downRightColumn; column++) {
            for (int row = upperLeftRow; row <= downRightRow; row++) {
                if(expected[column][row]==0){
                    expected[column][row]=1;
                }else{
                    expected[column][row]=0;
                }
            }
        }

        return expected;
    }
    int[][] turnLights(int[][] expected,Pair coordinates, int turnValue){
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                expected[column][row]=0;
            }
        }
        int upperLeftColumn = coordinates.getUpperLeft().getColumn();
        int upperLeftRow = coordinates.getUpperLeft().getRow();
        int downRightColumn = coordinates.getDownRight().getColumn();
        int downRightRow = coordinates.getDownRight().getRow();

        for (int column = upperLeftColumn; column <= downRightColumn; column++) {
            for (int row = upperLeftRow; row <= downRightRow; row++) {
                expected[column][row]=turnValue;
            }
        }


        return expected;
    }
}
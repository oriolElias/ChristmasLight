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

    public int[][] turnLight(Pair coordinates,int turnValue) {


        int upperLeftColumn = coordinates.getUpperLeft().getColumn();
        int upperLeftRow = coordinates.getUpperLeft().getRow();
        int downRightColumn = coordinates.getDownRight().getColumn();
        int downRightRow = coordinates.getDownRight().getRow();

        for (int column = upperLeftColumn; column <= downRightColumn; column++) {
            for (int row = upperLeftRow; row <= downRightRow; row++) {
                lights[column][row]=turnValue;
            }
        }
        return lights;
    }

    public int[][] toggle(Pair coordinates){
        int upperLeftColumn = coordinates.getUpperLeft().getColumn();
        int upperLeftRow = coordinates.getUpperLeft().getRow();
        int downRightColumn = coordinates.getDownRight().getColumn();
        int downRightRow = coordinates.getDownRight().getRow();

        for (int column = upperLeftColumn; column <= downRightColumn; column++) {
            for (int row = upperLeftRow; row <= downRightRow; row++) {
                if(lights[column][row]==0){
                    lights[column][row]=1;
                }else{
                    lights[column][row]=0;
                }
            }
        }

        return lights;
    }
}

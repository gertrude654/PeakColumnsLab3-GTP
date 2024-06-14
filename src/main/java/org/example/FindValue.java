package org.example;

public class FindValue {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 8, 3, 4, 0},
                {6, 7, 2, 7, 0}
        };

        // Step 1: Find the highest value in the array
        int maxVal = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Step 2: Find the lowest value in the column that contains the highest value
        int minInCol = arr[0][maxCol];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][maxCol] < minInCol) {
                minInCol = arr[i][maxCol];
            }
        }
        System.out.println(minInCol);
        int indexOfTemp = 0;
        int rowIndex = 0;
        for(int i = 0; i <2;i++ ){
            for(int j = 0;j <5;j++){
                    if(arr[i][j]==minInCol){
                        rowIndex = i;
                        indexOfTemp = j;


                }

            }
        }
        System.out.println(rowIndex);
        System.out.println(indexOfTemp);

        System.out.println("Highest value in the array: " + maxVal);
        System.out.println("Lowest value in the column of the highest value: " + minInCol);
    }
}

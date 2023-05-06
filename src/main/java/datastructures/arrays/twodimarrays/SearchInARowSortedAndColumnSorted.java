package datastructures.arrays.twodimarrays;

import java.util.Arrays;

public class SearchInARowSortedAndColumnSorted {
    public static void main(String[] args) {

        // row is sorted and cloumn is also sorted
        //[] matrix sturcture
        // [
        //   10 20 30 40
        //   11 25 35 45
        //   28 29 37 49
        //   33 34 38 50
        // ]
        //[ {10,20,30,40}, {11 25 35 45},{28 29 37 49},{33 34 38 50}]
                        //         0              1                  2                3
                       //         0   1  2  3    0   1   2  3     0  1   2   3     0   1    2  3
     int[][] array = new int[][]{{10,20,30,40},{11 ,25, 35, 45},{28, 29, 37, 49},{ 33, 34, 38, 50}};

        System.out.println(Arrays.toString(searchInSortedRowAndCol(array,29)));
        System.out.println(Arrays.toString(searchInSortedRowAndCol(array,50)));
        System.out.println(Arrays.toString(searchInSortedRowAndCol(array,11)));
    }

    private static int[] searchInSortedRowAndCol(final int[][] array,final int target) {

        int row = 0;
        int col = array[row].length-1; // col =3

       while(row<array.length)
       {
           if(target==array[row][col])
           {
               return new int[]{row,col};
           } else if (target > array[row][col]) {
               row++;
           } else if (target<array[row][col]) {
               col--;
           }
       }

        return new int[]{-1,-1};

    }
}

package datastructures.arrays;

public class Array2dExample {
    public static void main(String[] args) {

        // 2d arrays are nothing but array of array
        int[][] array = {
                {1,2,3,4}, // but an array
                {5,6},
                {7,8,9}
        };
        // print this array
        //
        for(int row=0;row< array.length;row++)
        {
           for(int col=0;col< array[row].length;col++)
               System.out.print(array[row][col]+ " ");

            System.out.println(" ");
        }


    }
}

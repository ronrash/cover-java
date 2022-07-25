package datastructures.binary.arrays.Questions;

public class FindWealthiest {

    /*
    * Find wealth
    * find the max in a 2d array
    * */



    public static void main(String[] args) {
        int[][] a = {
                {10,30,200} //60
                ,{1,1,1}   // 3
                ,{7,7,70}  // 84
        };

        findMaxValue(a);
        System.out.println(findMaxValue(a));
    }

    private static int findMaxValue(final int[][] a) {

        int maxvalue = Integer.MIN_VALUE;
        for(int row=0;row<a.length;row++)
        {
            int accountBalance=0;
            for(int col=0;col<a[row].length;col++)
            {
                accountBalance+=a[row][col];
            }

          if(accountBalance>maxvalue)
          maxvalue=accountBalance;
        }
            //

         return maxvalue;
    }
}

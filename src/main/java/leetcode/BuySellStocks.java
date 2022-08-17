package leetcode;

import com.sun.jdi.IntegerValue;

public class BuySellStocks {

    public static void main(String[] args) {
        // best time to sell stocks
        // sliding window problem
        // a-->{7,1,5,3,6,4}

//        int a[] = {7, 1,5, 3, 6, 4};
       int[] a= {2,1,2,1,0,1,2  };
        // max profit is 5

        buySellStocks(a);
        System.out.println(buySellStocks(a));
    }

    private static int buySellStocks(final int[] a) {

        int i = 0, j = 1;
        int maxProfit = Integer.MIN_VALUE;
        while (j < a.length ) {
             int currentProfit =(a[j] - a[i]);
            if ( currentProfit> maxProfit)
                maxProfit = currentProfit;

            if (a[j] < a[i]) {
                i=j;
                j++;
            }
            else
            j++;
        }

        return maxProfit<0?0:maxProfit;
    }
}

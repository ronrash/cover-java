package datastructures.recursion;

public class RecursionBasic {

    /*
     *  fibonncaci
     *
     *   0,1,2,3,5,8,13
     *  f(n)=f(n-1)+f(n-2)
     * */

    public static void main(String[] args) {

        int ans = fibo(4);
    }

    private static int fibo(final int n) {

        // base condition
        if (n < 2)
            return n;
        int leftPart = fibo(n-1);
        int rightPart =fibo(n-2);
        return leftPart+rightPart;
//        return fibo(n-1) +fibo(n-2);
    }
}

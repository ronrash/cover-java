package datastructures.arrays.twopointerQuestions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1,1};//{12,11}
        int maxArea = maxArea(a);
        System.out.println(maxArea);


        bruteForceSolution(a);

    }

    private static void bruteForceSolution(final int[] a) {

        int lenght = 0;
        int breadth = 0;
        int maxArea = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                lenght = a[i] < a[j] ? a[i] : a[j];

                breadth = Math.abs(j - i);
                maxArea = Math.max((lenght * breadth), maxArea);
            }
        }

        System.out.println(maxArea);
    }

    public static int maxArea(int[] a) {
        int left =0;
        int right =a.length-1;
        int length =0;
        int breadth = 0;
        int maxarea=0;
        while(left<right)
        {
            if(a[left]<a[right])
            {
             length=a[left];
             breadth=right-left;
             int area = length*breadth;
             maxarea = Math.max(area,maxarea);
             left++;
            }
            else {
                length=a[right];
                breadth=right-left;
                int area = length*breadth;
                maxarea = Math.max(area,maxarea);
                right--;
            }
        }
        return maxarea;
    }
}

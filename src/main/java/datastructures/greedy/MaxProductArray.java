package datastructures.greedy;

public class MaxProductArray {
    public static void main(String[] args) {

        int[] array = {2,3,-2,4};

        maxProductArray(array);
        maxProduct(array);
    }

    private static int maxProductArray(final int[] array) {

        //
        int currentProduct = array[0];
        int maxProduct = array[0];
        for(int i=1;i< array.length;i++)
        {

            if(array[i]<0)
            {
                currentProduct=1;
                continue;

            }
            if(array[i]*currentProduct > currentProduct)
            {
                currentProduct = array[i]*currentProduct;
            }


            maxProduct = Math.max(currentProduct,maxProduct);
        }
        System.out.println(maxProduct);
        return maxProduct;
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct for the current element
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the final result
            result = Math.max(result, maxProduct);
        }
        System.out.println(result);
        return result;
    }
}

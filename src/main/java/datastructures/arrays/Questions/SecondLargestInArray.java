package datastructures.arrays.Questions;

public class SecondLargestInArray {

    public static void main(String[] args) {
        /*
        *    This program loops through the array and keeps track of the largest and second largest elements it has seen so far.
        * If the current element is larger than the current largest element, we update the second largest element to be the previous largest element and the largest element to be the current element. If the current element is between the current largest and second largest elements, and it is not equal to the current largest element,
        * we update the second largest element to be the current element. Finally, we print out the second largest element
        *
        *
        * */

        int[] array = new int[]{10,9,56,20,100,2}; // 78 unsortded Array

        int largest = array[0];
        int secondLargest = array[0];

        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]>largest)
            {
                secondLargest =largest;
                largest=array[i];
            } else if (array[i]>secondLargest && array[i]!=largest) {
                secondLargest=array[i];

            }
        }
        System.out.println(secondLargest);

    }
}

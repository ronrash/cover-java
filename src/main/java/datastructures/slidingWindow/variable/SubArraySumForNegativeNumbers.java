package datastructures.slidingWindow.variable;

import java.util.HashMap;

public class SubArraySumForNegativeNumbers {
    public static void main(String[] args) {

        int[] a= {10,15,5,-25,6,10,5,5,20,-41};
        int[] a1 = {1, 2, 3, 4}; //
        int target = 5;
        // 15 -10 = 5 whihc is in position 3&4

        // y = y-k+k
      //  int[] a1= {-2,-3,4,-1,-2,1,5,-3};

      //  subArraySum(a,target);
        longestSubArrayOfSum(a,5);
      // subArraySumUsingFreqMap(a,target);
       // bruteForce(a,target);
        int maxLength = longestSubArraySun(a1, 6);
        System.out.println("max length is "+maxLength);
    }

    private static void bruteForce(final int[] a, final int target) {
        //
        System.out.println("brute force solution complexity O(n*n)");
        for(int i=0;i<a.length;i++)
        {
            int sum =0;
            for(int j=i;j<a.length;j++)
            {
                sum = sum +a[j];
                if(sum==target)
                {
                    System.out.println(i+"  "+j);
                    break;
                }
            }
        }
    }

    private static void subArraySumUsingFreqMap(final int[] a, final int target) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0,1);
        int sum =0;
         int ans=0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
            int remaingSum = sum -target;
            if(freqMap.containsKey(remaingSum))
            {
                ans = ans+freqMap.get(remaingSum);
            }
            freqMap.put(sum,freqMap.getOrDefault(sum,0)+1);
        }
    }

    private static void subArraySum(final int[] a, final int target) {

        int start =0;
        int end =-1; // when we dont get the value
        int i=0;
        int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(i<a.length)
        {
            sum+=a[i]; // sum

            if(sum-target==0)
            {
                end=i;
                break;
            }
            if(map.containsKey(sum-target))
            {
                start= map.get(sum-target)+1;
                end = i;
               break;
            }
            map.put(sum,i);
            i++;
        }
        System.out.println(start+" "+end);
    }
    private static void longestSubArrayOfSum(final int[] a, final int target) {

        int start =0;
        int end =-1; // when we dont get the value
        int i=0;
        int sum =0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(i<a.length)
        {
            sum+=a[i];

            if(sum-target==0)
            {
                end=i;
                maxLength= Math.max(maxLength,end-start+1);
                System.out.println(maxLength);
            }
            if(map.containsKey(sum-target))
            {
                start= map.get(sum-target)+1;
                end = i;
                maxLength= Math.max(maxLength,end-start+1);
                System.out.println(maxLength);
            }
            map.put(sum,i);
            i++;
        }
        System.out.println(maxLength);
    }

    private static int longestSubArraySun(final int[] a, final int target){
        int index=0;
        int start =0;
        int end=0;
        int maxLength=0;
        int sum=0;
        while(index<a.length)
        {
           sum =sum+a[index];

           if(sum==target)
           {
               end=index;
               maxLength=Math.max(maxLength,(end-start)+1);
               start=end+1;
               sum=0;

           }
       index++;
        }
        return maxLength;
    }
}

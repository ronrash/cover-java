package datastructures.binary.arrays;

import java.util.ArrayList;

public class ArrayList2d {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list= new ArrayList<>(10);
        int j=0;

        // initilaize the arraylist
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int row =0;row< 3;row++)
        {
            for(int col=0;col<3;col++)
            {
                list.get(row).add(j++);
            }
        }

        System.out.println(list);//---> [[0, 1, 2], [3, 4, 5], [6, 7, 8]]
    }
}

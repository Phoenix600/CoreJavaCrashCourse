package arraysInJava;

import java.util.Arrays;

// Copying the elements of Original Array Into Another Array
public class Example8 {
    public static void main(String[] args) {

        int[] nums = new int[] {10,20,-10,-20,30};
        int[] nums_copy = new int[nums.length];

        System.out.println("Arrays :" +Arrays.toString(nums));

        // Copying Elements
        for(int i=0; i<nums.length; i++)
        {
            nums_copy[i] = nums[i];
        }

    }
}

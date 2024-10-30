package arraysInJava;

import java.util.Arrays;

// Reverse Copy Elements In Array
public class Example9 {
    public static void main(String[] args) {
        int[] nums = new int[]{10,20,30,40};
        int[] rev_nums = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--)
        {
            rev_nums[nums.length-1-i] = nums[i];
        }

        System.out.println(Arrays.toString(rev_nums));

    }
}

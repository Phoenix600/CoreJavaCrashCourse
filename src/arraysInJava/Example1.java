package arraysInJava;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 13;

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums);

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[7]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

        for(int i=0; i <= 9; i++)
        {
            System.out.println(nums[i]);
        }

        int index = 0;
        while(index < 10)
        {
            System.out.println(nums[index]);
            index++;
        }

        System.out.println("[1,2,3,4,5,6,7,8,9]");

        System.out.println(Arrays.toString(nums));

    }
}

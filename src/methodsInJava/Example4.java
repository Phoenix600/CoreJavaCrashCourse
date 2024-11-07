package methodsInJava;

import java.util.Arrays;

public class Example4 {

    public static void changeValue(Integer x)
    {
        x = 99;
    }

    public static void changeElementAtZerothPosition(int nums[])
    {
        nums[0] = -99;
    }

    public static void display(int nums[])
    {
        for (int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println();
    }

    // there is only one method in java for parameter passing.
    // The contents of actual argument is copied function parameters
    public static void main(String[] args) {
        Integer x = 12;
        changeValue(x);
        System.out.println(x);

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        changeElementAtZerothPosition(nums);

       }
}

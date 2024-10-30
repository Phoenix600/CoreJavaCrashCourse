package arraysInJava;

import java.util.Scanner;

// Print the array in revere order
public class Example7 {
    public static void main(String...args)
    {
        int size;
        int[] nums;
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        size = Input.nextInt();

        nums = new int[size];

        System.out.println("Enter the array elements : ");
        for(var i = 0; i < size; i++)
        {
            nums[i] = Input.nextInt();
        }

        // Printing Array In reverse
        for(var i=size-1; i>=0; i--)
        {
            System.out.print(nums[i] + " ");
        }

    }
}

package arraysInJava;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        int size; // scalar
        int[] nums; // reference variable or Vector

        Scanner Input = null;
        Input = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        size = Input.nextInt(); // 5

        nums = new int[size]; // [10,20,0,0,0]

        for(int i=0; i<size; i++) // [0 --> 4]
        {
            System.out.printf("Enter the value of nums[%d] : ",i);
            nums[i] = Input.nextInt(); // 10, 20,
        }

        for(int i=0; i<size; i++)
        {
            System.out.printf("nums[%d] : %d \n",i,nums[i]);
        }

        // [1,2,3,4,5,6,7,8,9,10]; //-> ][SUM OF ELEMENTS : 55 10


    }
}

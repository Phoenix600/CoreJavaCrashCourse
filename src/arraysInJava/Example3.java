package arraysInJava;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // Reading Elements In Array From User
        int[] nums = new int[5]; // [0,0,0,0,0]

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter nums[0] element : ");
        nums[0] = Input.nextInt();

        System.out.println("Enter nums[1] element : ");
        nums[1] = Input.nextInt();

        System.out.println("Enter the nums[2] element : ");
        nums[2] = Input.nextInt();

        System.out.println("Enter the nums[3] element : ");
        nums[3] = Input.nextInt();

        System.out.println("Enter the nums[4] element : ");
        nums[4] = Input.nextInt();

        for(int i=0; i<5; i++)
        {
            System.out.print(nums[i] + " ");
        }

    }
}

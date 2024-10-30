package arraysInJava;

import java.util.Scanner;

// Calculate the product of all elements in array
public class Example6 {
    public static void main(String...args)
    {
        int size = 5;
        int[] nums = new int[size];
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Enter the 5 elements in array : ");
        
        for (int i=0; i<size; i++)
        {
            nums[i] = Input.nextInt();
        }
        
        int product_of_all_elements = 1;

        for (int i = 0; i < size; i++) {
            product_of_all_elements *= nums[i];
        }


        System.out.println("Product Of All Elements : " + product_of_all_elements );
    }
}

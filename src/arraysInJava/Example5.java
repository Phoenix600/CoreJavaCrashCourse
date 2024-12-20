package arraysInJava;
import java.util.*;

// Calculating the sum of elements in array
public class Example5 {
    public static void main(String[] args)
    {

        int size; // scalar
        int[] nums; // reference variable or Vector
        int sum = 0;

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

        // Calculating the sum of elements
        for(int i=0; i<size; i++)
        {
          sum = sum + nums[i];
        }
        System.out.println("Sum of Elements in Array : " + sum);

    }
}

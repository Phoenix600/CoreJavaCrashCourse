package loopsInJava.practice;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // Print the addition of number within range
        int lowerLimit;
        int upperLimit;
        int sum = 0;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the lowerLimit : ");
        lowerLimit = Input.nextInt();

        System.out.println("Enter th upperLimit : ");
        upperLimit = Input.nextInt();

        for (int i=lowerLimit; i<upperLimit; i++)
        {
            sum = sum + i;
        }

        System.out.printf("Sum of numbers from %d to %d is %d",lowerLimit,upperLimit,sum);
    }


}

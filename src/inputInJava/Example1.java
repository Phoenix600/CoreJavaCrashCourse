package inputInJava;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.println("Enter the number-1 : ");
        num1 = Input.nextInt();

        System.out.println("Enter the number-2 : ");
        num2 = Input.nextInt();

        result = num1 + num2;
        System.out.println("The sum is " + result);
    }
}

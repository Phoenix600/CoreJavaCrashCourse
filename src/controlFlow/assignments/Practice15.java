package controlFlow.assignments;
import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        int side1;
        int side2;
        int side3;

        System.out.println("Enter the sides of Triangle : ");

        System.out.println("Enter the side-1 : ");
        side1 = Input.nextInt();

        System.out.println("Enter the side-2 : ");
        side2 = Input.nextInt();

        System.out.println("Enter the side-3: ");
        side3 = Input.nextInt();

        if(side1 == side2 && side1 == side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
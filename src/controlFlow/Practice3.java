package controlFlow;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args)
    {
       Scanner Input =  new Scanner(System.in);
        int number;
        System.out.println("Enter the number : ");
        number = Input.nextInt();

        if(number < 0)
        {
            System.out.println("Negative");
        }else if(number == 0)
        {
            System.out.println("Zero");
        }
        else{
            System.out.println("Positive");
        }


    }
}

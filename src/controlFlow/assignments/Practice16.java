package controlFlow.assignments;
import java.util.Scanner;

public class Practice16 {
    public static  void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int weekDay;

        System.out.println("Enter a week day number : ");
        weekDay = Input.nextInt();

        switch(weekDay)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid WeekDay number");
                break;
        }

    }
}

package methodsInJava;

public class Example12 {

    static void printNames(String...names)
    {
        for(String name : names)
        {
            System.out.println(name);
        }
    }

    static int add(int...x)
    {
        int sum = 0;
        for(int target : x)
        {
            sum = sum + target;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] A = {12,13,14,15};
        int targetSum = add(12,13,14,15);
        System.out.println(targetSum);
        targetSum = add(A);
        System.out.println(targetSum);

        printNames("Pranay","Mukul","Tushar","Prathamesh","Veer","Tanvi","Shruti");
        String[] names = {"Pranay","Mukul","Tushar","Prathamesh","Veer","Tanvi","Shruti"};
        printNames(names);

    }

}

package stringsInJava;

public class Example1 {
    public static void main(String[] args)
    {
        String name1 = "Pranay";

        String name2 = new String();
        String name3 = new String("Diya");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        
        System.out.println(name3.getBytes());
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());
    }
}

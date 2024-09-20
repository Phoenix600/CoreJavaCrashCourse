package printingInJava;

public class Example4 {
    public static void main(String[] args)
    {
        int x = 22;
        String myName = "Pranay";
        String controlString = "Hello My Name is %s and age is %d\n";
        System.out.printf(controlString,myName,x,1212,121212);

        float cellDivisionStart = 30*60*60*-1e6f;
        System.out.printf("The value is %g \n",cellDivisionStart);

        int x1 = 10;
        int x2 = 20;
        int x3 = 30;

        System.out.printf("Num1: %d.....Num2: %d....Num3: %d \n",x1,x2,x3);
        System.out.printf("Num1: %3$d...Num2: %1$d....Num3: %2$d \n",x1,x2,x3);

        System.out.format("Num1: %3$d...Num2: %1$d....Num3: %2$d \n",x1,x2,x3);

        String name1 = "ITEM-NO";
        String name2 = "ITEMS";
        String name3 = "Remarks";

        System.out.printf("%s %s %s \n",name1,name2,name3);
        System.out.printf("%10s %10s %10s\n",name1,name2,name3);

        int number = 1;
        String topic  = "CA";
        String pipe = "|";
        System.out.printf("%s %30d. %4$80s %30s",pipe,number,topic,pipe);



    }
}

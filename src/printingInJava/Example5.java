package printingInJava;

import java.util.Locale;

public class Example5 {
    public static void main(String[] args) {

        int num1 = 12;
        byte num2 = 111;
        short num3 = 333;
        long num4 = 4444444L;

        System.out.printf("%d\n",num1);
        System.out.printf("%d\n",num2);
        System.out.printf("%d\n",num3);
        System.out.printf("%d\n",num4);
        System.out.printf("%b\n",true);

        // Argument Index
        System.out.printf("%1$d %1$d %1$d\n",num2);
        System.out.printf("%2$d %1$d %1$d\n",num1,num2);

        // Flag-Width
        System.out.printf("%5d\n",12);
        System.out.printf("%012d\n",12);
        System.out.printf("%(12d\n",12);
        System.out.printf("%(12d\n",-12);
        System.out.printf("%+5d\n",12);
        System.out.printf("%+5d\n",-12);

        float num7 = 12.45f;
        System.out.printf("%.2f \n",num7);
        System.out.printf("%f \n",num7);
        System.out.printf("%2$10.3f.....%1$10.2f\n",12.121212f,10.11781f);

        String data = "JAVA";
        System.out.printf("%-10s\n",data);
        System.out.printf("%10s\n",data);


    }
}

package printingInJava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Example6 {
    public static void main(String[] args) throws IOException {

        PrintStream out = new PrintStream("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\data\\data.logs");

        int number1 = 1212;
        byte number2 = 127;
        short number3 = 2345;
        long number4 = 6789323230L;

        boolean bool = true;
        char c = 'A';

        String str = "JAVA is Hybrid Language";

        out.print(number1+"...");
        out.print(number2+"...");
        out.print(number3+"...");
        out.print(number4+"....");
        out.print(c+"...");
        out.print(str+"...");
        out.print(bool+"...");


        out.println("NEW-LINES PRINTING");
        out.println(number1);
        out.println(number2);
        out.println(number3);
        out.println(number4);
        out.println(c);
        out.println(str);
        out.println(bool);

    }
}

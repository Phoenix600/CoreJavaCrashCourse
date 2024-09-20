package printingInJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Example11 {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\data\\Example11");
        PrintStream out = new PrintStream(fos);
        System.setOut(out);
        System.out.println("I Added this data dia");
    }
}

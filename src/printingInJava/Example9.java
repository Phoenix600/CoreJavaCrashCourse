package printingInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
// Logger
public class Example9 {
    // Declaring ANSI_RESET so that we can reset the color
    public static String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static String ANSI_YELLOW = "\u001B[33m";
    public static String ANSI_RED_BACKGROUND= "\u001B[41m";
    public static String ANSI_GREEN = "\u001B[32m";

    public static String WARN = ANSI_YELLOW+"[+]WARNING:::%s"+ANSI_RESET;
    public static String ERROR = ANSI_RED_BACKGROUND+"[X]ERRORS:::%s"+ANSI_RESET;
    public static String SUCCESS= ANSI_GREEN+"[✅]RIGHT:::%s"+ANSI_RESET;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\data\\myLogs.log");
        PrintStream out = new PrintStream(file);
        System.out.println(WARN);
        System.out.println(SUCCESS);
        System.out.println(ERROR);
        System.err.println("ERRORORORO");
    }

}

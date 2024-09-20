package printingInJava;

import java.io.File;
import java.io.PrintStream;
import java.util.Date;

public class Example8 {
    public static void main(String[] args)throws Exception {
        File file = new File("myLogs.log");
        PrintStream out = new PrintStream(file);

        String LOG_STRING = "%5d | %20s | %20s | %20d\n";

        File mainFile = new File("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\Example11.java");
        for (int i=0; i<1e3; i++)
        {
            out.printf(LOG_STRING,i,mainFile.getPath(), mainFile.getName(), mainFile.getFreeSpace());
        }

    }
}

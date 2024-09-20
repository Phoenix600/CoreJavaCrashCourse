package printingInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Example13 {
    public static void main(String[] args) throws IOException {
     FileInputStream fis = new FileInputStream("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\data\\DataMessenger");

//     System.in; // Keyboard
     System.setIn(fis);

     Scanner Input = new Scanner(System.in);

        System.out.println(new String(System.in.readAllBytes()));
    }
}

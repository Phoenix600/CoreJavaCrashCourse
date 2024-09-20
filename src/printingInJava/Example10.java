package printingInJava;

import java.io.FileInputStream;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args)throws  Exception {

        FileInputStream fis = new FileInputStream("C:\\Users\\root\\Desktop\\coreJavaMastery\\src\\printingInJava\\data\\Example10");
        System.setIn(fis);

        Scanner Input = new Scanner(System.in);
        System.out.println(Input.next());
        System.out.println(Input.next());
        System.out.println(Input.next());
        System.out.println(Input.next());

    }
}

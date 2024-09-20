package inputInJava;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Example8 {
    public static void main(String[] args) throws FileNotFoundException {

        File myData = new File("C:\\Users\\root\\IdeaProjects\\coreJavaMastery\\src\\data\\MyData.csv");
        Scanner Input = new Scanner(myData);

        String myLine;
        myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

//        myLine = Input.nextLine();
//        System.out.println(myLine);
    }
}

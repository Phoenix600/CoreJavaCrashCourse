package methodsInJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class Example1 {

    public static float volumeOfCuboid(float l, float b, float h)
    {
        // Logical Implementation Of Method

        // calculating the volume of cuboid
        float volume = l * b * h;
        return volume;


    }

    public static void sayHello(String name)
    {
        System.out.println("Hello : " + name);
        return;
    }

    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        float len;
        float bre;
        float hei;
        float volume;

        System.out.println("Enter the l, b and h  : ");
        len = Input.nextFloat();
        bre = Input.nextFloat();
        hei = Input.nextFloat();

        volume = volumeOfCuboid(len,bre,hei); // 120
        System.out.println("Volume : " + volume);

        sayHello("Pranay");

    }
}

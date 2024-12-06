package oopInJava;

class Cylinder{
    double radius; // 0.0
    double height; // 0.0

    double volume()
    {
        double vol = 3.14 * radius * radius * height;
        return vol;
    }
    double perimeter()
    {
        double peri = (4*radius) + (2*height);
        return peri;
    }
}

public class Example5 {

    public static void main(String[] args) {
//        Cylinder c1;
        Cylinder c1 = null;
        System.out.println(c1);

        c1 = new Cylinder();
        System.out.println(c1);

        System.out.println("Radius : " + c1.radius);
        System.out.println("Height : " + c1.height);

        double vol = c1.volume();
        System.out.println("Volume : " + vol);

        double peri = c1.perimeter();
        System.out.println("Perimeter : " + peri);

        c1.radius = 10;
        c1.height = 20;

        System.out.println("Radius : " + c1.radius);
        System.out.println("Height : " + c1.height);

        peri = c1.perimeter();
        System.out.println("Perimeter : " + peri);

        vol = c1.volume();
        System.out.println("Volume : " + vol);


    }
}

package oopInJava;


class Circle{
    double radius;

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
    double getPerimeter()
    {
        return 2 * (22.0/7.0) * radius;
    }
}


public class Example2 {
    public static void main(String[] args) {
        Circle c1 = null;
        c1 = new Circle();

        System.out.println(c1);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());


        c1.radius = 10;
        System.out.println(c1.getArea());
        double perimeter = c1.getPerimeter();
        System.out.println(perimeter);
    }
}

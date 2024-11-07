package methodsInJava;
// Examples of Methods Overloading
// overloaded methods to calculate area
public class Example9 {

    public static int area(int side)
    {
        return side*side;
    }

    public static int area(int length, int breadth)
    {
        int area = length*breadth;
        return area;
    }

    public static float area(float radius)
    {
        float area = 3.14f*radius*radius;
        return  area;
    }

    public static void main(String[] args) {

        Object o = area(12);
        System.out.println("Area of square : " + o);

        o = area(12,13);
        System.out.println("Area of reactangle : " + o);

        o = area(10f);
        System.out.println("Area of circle : " + o);
    }
}

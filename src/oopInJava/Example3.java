package oopInJava;

class Rectangle{
    int length;
    int breadth;

    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}


public class Example3 {
    public static void main(String[] args) {
        Rectangle r1 = null;
        System.out.println(r1);

        r1 = new Rectangle();
        System.out.println(r1);

        System.out.println(r1.length);
        System.out.println(r1.breadth);

        int area = r1.area();
        System.out.println(area);

        int perimeter = r1.perimeter();
        System.out.println(perimeter);

        r1.length = 12;
        r1.breadth = 10;

        perimeter = r1.perimeter();
        System.out.println(perimeter);

        area = r1.area();
        System.out.println(area);

    }
}

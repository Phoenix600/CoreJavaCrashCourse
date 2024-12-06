package oopInJava;

class RectangleEntity
{
    int len;
    int bre;

    public RectangleEntity()
    {
        super();
        this.len = 10;
        this.bre = 14;
    }

    int area()
    {
        return this.len * this.bre;
    }

    void display()
    {
        System.out.println("Function of RectangleEntity class");
    }
}

class CuboidEntity extends RectangleEntity{
   int h;

   public CuboidEntity()
   {
     super(); // @important: This should be the very first line while having parent-child relationship.
     this.h = 100;
   }

   int volume()
   {
       return this.h * this.len * this.bre;
   }
}

public class Example15 {
    public static void main(String[] args) {
        CuboidEntity c1 = new CuboidEntity();

        int area =  c1.area();
        System.out.println("Area : " + area);

        int volume = c1.volume();
        System.out.println("Volume : " + volume);

        System.out.println("Len : " + c1.len);
        System.out.println("Breadth : " + c1.bre);
        System.out.println("Height : "+ c1.h);

        RectangleEntity r1 = new RectangleEntity();
        area = r1.area();
        System.out.println("Area Of Rectangle : " + area);

        // Parent Can Hold the Object of Child class
        RectangleEntity parent = new CuboidEntity();
    }
}

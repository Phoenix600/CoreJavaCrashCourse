package methodsInJava;

public class Example10 {

    float areaOfRightAngledTriangle(float base, float height)
    {
        float area = 0.5f * base * height;
        return area;
    }

    static float AreaOfRT(float base, float height)
    {
        float area = 0.5f * base * height;
        return area;
    }

    public static void main(String[] args) {

        // Create Object Then Call The Method Via Object
        Example10 obj = new Example10();
        float data =  obj.areaOfRightAngledTriangle(12f,10f);

        System.out.println("Area Of RT : " + data);

        // Static
        data = Example10.AreaOfRT(12f,10f);
        System.out.println("Area Of RT : "+ data);
    }
}

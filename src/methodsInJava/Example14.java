package methodsInJava;

class MyClass
{
    static void sayHello()
    {
        System.out.println("Hello from MyClass");
    }
}

public class Example14 {

    static void sayHello()
    {
        System.out.println("Hello From Example14");
    }

    public static void main(String[] args) {
        sayHello();
        MyClass.sayHello();
    }
}

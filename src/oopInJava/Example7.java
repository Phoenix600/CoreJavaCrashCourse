package oopInJava;

class Car
{
    String brand;
    String color;
    double weight;
    boolean isPetrol;
    double price;
    short mileage;

    static String distributer = "Hyundai";

    void stop()
    {
        System.out.println("Engine Stopped");
    }

    void start()
    {
        System.out.println("Engine Started");
    }

    void accelerate()
    {
        System.out.println("Accelerating Engine");
    }

    void brake()
    {
        System.out.println("Applying Brakes");
    }

    void displayCarDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
        System.out.println("Petrol : " + isPetrol);
        System.out.println("Price : " + price);
        System.out.println("Mileage : " + mileage);
    }

    static String getClassName()
    {
        return "Car Class";
    }

}

public class Example7 {
    public static void main(String[] args) {
        Car car = null;
        System.out.println(car); // null

        car = new Car();
        System.out.println(car); // address

        System.out.println(car.brand); // null
        System.out.println(car.weight);// 0.0
        System.out.println(car.mileage); // 0
        System.out.println(car.color); // null
        System.out.println(car.isPetrol);// false
        System.out.println(car.price); // 0.0

        car.brand = "Honda City";
        car.weight = 1000.0;
        car.mileage = 10;
        car.color = "White";
        car.isPetrol = true;
        car.price = 1000000.0;

        System.out.println(car.brand); // Honda City
        System.out.println(car.weight);// 1000.0
        System.out.println(car.mileage); // 10
        System.out.println(car.color); // White
        System.out.println(car.isPetrol);// true
        System.out.println(car.price); // 1000000.0

        car.start();
        car.accelerate();
        car.brake();
        car.stop();

        car.displayCarDetails();

        System.out.println(Car.distributer); // Hyundai
        System.out.println(Car.getClassName()); // Car
//        String res = Car.getClassName();
//        System.out.println(res);
    }
}

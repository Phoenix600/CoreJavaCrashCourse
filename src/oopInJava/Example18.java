package oopInJava;


import java.io.FileInputStream;
import java.util.Scanner;

// Hollow Class  (Abstract Class)
// You can not create the object of an abstract class
abstract class DummyCalculator
{
    // Abstract Method
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
    public abstract int div(int a, int b);
    public abstract int mul(int a, int b);

    public void display()
    {
       System.out.println("Abstract Class");
    }
}

class MobileCalculator extends DummyCalculator
{
    @Override
    public int add(int a, int b)
    {
        return  a+b;
    }

    @Override
    public int sub(int a, int b)
    {
        return  a-b;
    }


    @Override
    public int div(int a, int b)
    {
        return  a/b;
    }

    @Override
    public int mul(int a, int b)
    {
        return  a*b;
    }

    public double logBase2(int x)
    {
        return Math.log(x);
    }

    public void display()
    {
        System.out.println("Mobile Calculator");
    }



}


class LaptopCalculator extends DummyCalculator
{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    public void display()
    {
        System.out.println("Laptop Calculator");
    }

    public void displayOS()
    {
        System.out.println("Windows");
    }
}

public class Example18 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        MobileCalculator mobileCalculator = new MobileCalculator();

        int sum = mobileCalculator.add(12,13);
        System.out.println("Sum  : " + sum);

        int sub = mobileCalculator.sub(12,13);
        System.out.println("Sub  : " + sub);

        int div = mobileCalculator.div(12,13);
        System.out.println("Div  : " + div);

        int mul = mobileCalculator.mul(12,13);
        System.out.println("Mul  : " + mul);

        double log = mobileCalculator.logBase2(32);
        System.out.println("Log : " + log);

        mobileCalculator.display();

        DummyCalculator dummyCalculator = new MobileCalculator();

        sum = dummyCalculator.add(120,130);
        System.out.println("Sum  : " + sum);

        sub = dummyCalculator.sub(120,130);
        System.out.println("Sub  : " + sub);

        div = dummyCalculator.div(120,130);
        System.out.println("Div  : " + div);

        mul = dummyCalculator.mul(120,130);
        System.out.println("Mul  : " + mul);

        dummyCalculator.display();

        /// Child Can Hold The Object Of Iteself
        System.out.println("LaptopCalculator Reff. Holding Object LaptopCalculator");
        LaptopCalculator laptop = new LaptopCalculator();
        sum = laptop.add(12,13);
        System.out.println("Sum  : " + sum);

        div =  laptop.div(12,14);
        System.out.println("div : " + div);

        mul = laptop.mul(12,13);
        System.out.println("mul : " + mul);

        sub =  laptop.sub(100,-999);
        System.out.println("sub : " + sub);

        laptop.display();
        laptop.displayOS();

        // Parent Can Hold The Object Of Child Class
        System.out.println("DummyCalculator Reff. Holding Object LaptopCalculator");
//        DummyCalculator dummy = laptop;
        DummyCalculator dummy = new LaptopCalculator();

        sum = dummy.add(12,13);
        System.out.println("Sum  : " + sum);

        div =  dummy.div(12,14);
        System.out.println("div : " + div);

        mul = dummy.mul(12,13);
        System.out.println("mul : " + mul);

        sub =  dummy.sub(100,-999);
        System.out.println("sub : " + sub);

        // This will call the Child Class Display Method
        dummy.display();

    }
}

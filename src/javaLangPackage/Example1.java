package javaLangPackage;

import java.lang.*;
import java.util.Objects;

// User defined classes also inherit from Object class
// It is the mother of classes in java

public class Example1 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        boolean areSameObject = o1.equals(o2);
        System.out.println("Object are same : " + areSameObject);

        areSameObject = o1.equals(o1);
        System.out.println("Objects are same : " + areSameObject);



        int uniqueCode = o1.hashCode();
        System.out.println("HashCode : " + uniqueCode);

        System.out.println(o1);


    }
}

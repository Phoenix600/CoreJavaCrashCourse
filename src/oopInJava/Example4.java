package oopInJava;

class Student
{
    Long id;
    String name;
    String dob;
    String address;
    String branch;
    String phoneNumber;

    void displayStudentDetails()
    {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("DOB : " + dob);
        System.out.println("Address : " + address);
        System.out.println("Branch : " + branch);
        System.out.println("Phone Number : " + phoneNumber);
    }

}

public class Example4 {
    public static void main(String[] args) {
        Student s1 = null;
        System.out.println(s1);

        s1 = new Student();
        System.out.println(s1);

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.dob);
        System.out.println(s1.address);
        System.out.println(s1.branch);
        System.out.println(s1.phoneNumber);

        s1.id = 121212L;
        s1.name = "Pranay";
        s1.branch = "ETC";
        s1.dob = "12/12/2002";
        s1.phoneNumber = "+917378736964";
        s1.address = "Pune";

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.dob);
        System.out.println(s1.address);
        System.out.println(s1.branch);
        System.out.println(s1.phoneNumber);

        Student s2 = new Student();
        s2.name = "Vedant";
        s2.address = "Mumbai";
        s2.id = 12121278L;
        s2.phoneNumber = "+8293473843434";

        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.dob);
        System.out.println(s2.address);
        System.out.println(s2.branch);
        System.out.println(s2.phoneNumber);



    }
}

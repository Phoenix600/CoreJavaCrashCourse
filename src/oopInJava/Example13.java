package oopInJava;

import java.util.Random;

class StudentEntity
{
    ///  data members
   private String studentId;
   private String studentName;
   private String studentEmail;

   ///  constructors
    public StudentEntity()
    {
//        Random random = new Random();
//        this.studentId = String.valueOf(random.nextInt(1200000));
        this.studentId = String.valueOf(new Random().nextInt(12000000)); // Anonymous Object
    }

    public StudentEntity(String studentId, String studentName,String studentEmail)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    /// Getters And Setters
    public String getStudentId()
    {
        return this.studentId;
    }

    public String getStudentName()
    {
        return  this.studentName;
    }

    public String getStudentEmail()
    {
        return  this.studentEmail;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }


    ///  toString Method
    public String toString()
    {
        return "Name : " + this.studentName + "...Id : " + this.studentId + "...Email:" + this.studentEmail;
    }
}


public class Example13 {
    public static void main(String[] args) {
        StudentEntity student1 = new StudentEntity();
        System.out.println(student1);

        student1.setStudentName("pranay ramteke");
        student1.setStudentEmail("pranayramteke@gmail.com");

        System.out.println(student1);

        StudentEntity student2 = new StudentEntity("121212121212","Shruti Ramteke","shrutiramteke@gmail.com");
        System.out.println(student2);
    }
}

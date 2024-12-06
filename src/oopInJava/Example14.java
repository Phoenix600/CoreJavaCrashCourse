package oopInJava;

import java.util.Random;

class StudentRecord
{
    public String studentName;
    public String studentEmail;
    public int studentId;

    public StudentRecord()
    {
        Random rad  =  new Random();
        this.studentId = rad.nextInt(1900000);
    }

    ///  Getters And Setters

    public String getStudentName()
    {
        return  this.studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentEmail()
    {
        return  this.studentEmail;
    }

    public void setStudentEmail(String studentEmail)
    {
       this.studentEmail = studentEmail;
    }

    public int getStudentId()
    {
        return this.studentId;
    }

   public String toString()
   {
       return "Student Details : " + "Name : " + this.studentName + " Email : " + this.studentEmail + " Id : " + this.studentId;
   }
}

class ResonanceStudentRecord extends StudentRecord{
    public String batchName;
    public String courseName;

    public ResonanceStudentRecord()
    {
        super();
    }

    public String getBatchName()
    {
        return this.batchName;
    }

    public void setBatchName(String batchName)
    {
        this.batchName = batchName;
    }

    public String getCourseName()
    {
        return this.courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String toString() {
        return super.toString() + " Batch Name : " + this.batchName + " Course Name : " + this.courseName;
    }
}


public class Example14 {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();

        System.out.println(student1);

        student1.setStudentName("Rahul Ramteke");
        student1.setStudentEmail("rahulramteke@gmail.com");
        System.out.println(student1);


        ResonanceStudentRecord r1 = new ResonanceStudentRecord();
        r1.setStudentName("Divyani Bhoyar");
        r1.setStudentEmail("divyani.bhoyar@gmail.com");
        r1.setBatchName("Batch-1");
        r1.setCourseName("JEE Super Alpha");
        System.out.println(r1);

    }
}

package oopInJava;

import java.util.Random;

class UserAccount
{
    private Long userId = new Random().nextLong(1200000);
    private String fullName;
    private String phoneNumber;
    private String email;
    private String dob;
    private Boolean isFemale;
    private String password;

    // All Getter Methods
    public Long getUserId()
    {
        return this.userId;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getDob()
    {
        return this.dob;
    }

    public boolean getIsFemale()
    {
        return  this.isFemale;
    }

   public String getPassword()
   {
       return this.password;
   }

   // setter methods
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public void setIsFemale(Boolean isFemale)
    {
        this.isFemale = isFemale;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}

public class Example8 {
    public static void main(String[] args)
    {
        UserAccount account = new UserAccount();
        account.setUserId(1211212121L);
        account.setFullName("Pranay");
        account.setDob("17/05/2002");
        account.setEmail("thisispranayramteke@gmail.com");
        account.setIsFemale(false);
        account.setPassword("nahimahit");
        account.setPhoneNumber("7378736964");

        Long id = account.getUserId();
        System.out.println("Id : " + id);
        System.out.println(account.getUserId()); // 12121212
        System.out.println(account.getFullName());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getIsFemale());
        System.out.println(account.getDob());
    }
}

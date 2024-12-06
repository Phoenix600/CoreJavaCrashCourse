package oopInJava;

import java.time.LocalDateTime;

class FiverrUserAccount
{
    // Data Members (Properties)
   private String firstName;
   private String lastName;
   private String email;
   private String phoneNumber;  // --> Read & Write --> Getter And Setter
   private String password;    // Write Only --> Setter Fx
   private String username;
   private LocalDateTime createdAt; // Read Only Property // --> Getter

   // Constructors +2
    public FiverrUserAccount()
    {
        System.out.println("Creating FiverrUserAccount");
    }
    // Required Argument Constructor
    public FiverrUserAccount(
            String firstName,
            String lastName, String email,
            String phoneNumber, String password,
            String username
    )
    {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
            this.username = username;
            this.createdAt = LocalDateTime.now();
    }

    // Methods (Behaviours)
    public void displayFiverrUserAccountDetails()
    {
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Email : " + this.email);
        System.out.println("Username : " + this.username);
        System.out.println("Created At : " + this.createdAt);
    }

   // Getters And Setter
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public LocalDateTime getCreatedAt()
    {
        return this.createdAt;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    // ToString() method
    public String toString()
    {
        return String.format(this.email +"...." + this.username + "..." + this.lastName);
    }

}


public class Example11 {
    public static void main(String[] args) {
        FiverrUserAccount user = new FiverrUserAccount();
        System.out.println(user);

        user.setUsername("thisipranayramteke");
        System.out.println(user);

    }
}

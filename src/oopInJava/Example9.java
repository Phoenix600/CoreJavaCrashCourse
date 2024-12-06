package oopInJava;

class InstagramUser
{
    private Long userId;
    private String fullName;
    private String username;
    private String email;
    private String phone;
    private int numberOfPosts;
    private int numberOfFollowers;
    private int numberOfFollowing;

    // parameterless constructor
    InstagramUser()
    {
        System.out.println("Constructor Called");

        this.userId = 1212L;
        this.username = "john_d12";
        this.fullName = "John Doe";
        this.email = "jd@gmail.com";
        this.numberOfFollowing = 0;
        this.numberOfFollowers = 0;
        this.numberOfPosts = 0;
        this.phone = "+91";
    }

    // Parameterized Constructor
    InstagramUser(Long userId, String username, String fullName, String email)
    {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    public Long getUserId()
    {
        return this.userId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }
}

public class Example9 {
    public static void main(String[] args) {

        // Default Object
        InstagramUser u1 = new InstagramUser();
        System.out.println(u1.getUserId());

        InstagramUser u2 = new InstagramUser();
        System.out.println(u2.getUserId());

        InstagramUser u3 = new InstagramUser(1717L,"thisispranayramteke","pranay ramteke","thisispranayramteke@gmail.com");
        System.out.println(u3.getUserId());
    }
}

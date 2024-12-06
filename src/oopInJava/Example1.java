package oopInJava;

// PASCAL CASE
class Television
{
    int volume;
    int channel;
    String brandName;

    void changeVolume(int volume)
    {
        this.volume = volume;
    }

    void changeChannel(int channel)
    {
        this.channel = channel;
    }
}

public class Example1 {
    public static void main(String...args)
    {
        Television myTv = new Television();

        // Data Members
        System.out.println(myTv);
        System.out.println(myTv.channel);
        System.out.println(myTv.volume);
        System.out.println(myTv.brandName);

        myTv.volume = 100;
        myTv.brandName = "Samsung";
        myTv.channel = 54;

        System.out.println(myTv);
        System.out.println(myTv.channel);
        System.out.println(myTv.volume);
        System.out.println(myTv.brandName);

        // Member Functions
        myTv.changeVolume(67);
        System.out.println(myTv.volume);

        myTv.changeChannel(51);
        System.out.println(myTv.channel);
    }
}

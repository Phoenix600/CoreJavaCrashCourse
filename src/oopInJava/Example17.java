package oopInJava;

class Phone
{
    String device = "Phone";

    public void call()
    {
        System.out.println("Calling From Phone");
    }

    public void text()
    {
        System.out.println("Texting from Phone");
    }

}

class SmartPhone extends Phone
{
    String device1 = "SmartPhone";

    public void videoCall()
    {
        System.out.println("VideCalling from Smart Phone");
    }

    public void internet()
    {
        System.out.println("Using Internet from smart phone");
    }

    public void chat()
    {
        System.out.println("Chatting From SmartPhone");
    }

    @Override
    public void call()
    {
        System.out.println("Calling From Smart Phone");
    }
}


public class Example17 {
    public static void main(String[] args)
    {
        Phone phone = new Phone();
        System.out.println(phone.device);


        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone.device1);
        System.out.println(smartPhone.device);
        smartPhone.call();
    }
}

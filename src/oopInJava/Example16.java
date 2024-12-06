package oopInJava;
/// Interface For Grouping Multiple SmartPhone Objects
interface ISmartPhone
{
    abstract void audioCall();
    abstract void smsText();
    abstract void videoCall();
    abstract void chat();
    abstract void camera();
    abstract void internet();
}

class AppleIphoneOne implements ISmartPhone
{
    @Override
    public void audioCall()
    {
        System.out.println("Apple AudioCall");
    }

    @Override
    public void smsText() {
        System.out.println("Apple SmsText");
    }

    @Override
    public void videoCall() {
        System.out.println("Apple VideoCall");
    }

    @Override
    public void chat() {
        System.out.println("Apple Chat");
    }

    @Override
    public void camera() {
        System.out.println("Apple Camera");
    }

    @Override
    public void internet() {
        System.out.println("Apple Internet");
    }

    public void brandName()
    {
        System.out.println("Apple");
    }
}

///  Whenever we use interface, java force us to implement the abstract function in interface.
class OppoSmartA9 implements ISmartPhone
{

    @Override
    public void audioCall()
    {
        System.out.println("Oppo AudioCall");
    }

    @Override
    public void smsText() {
        System.out.println("Oppo SmsText");
    }

    @Override
    public void videoCall() {
        System.out.println("Oppo VideoCall");
    }

    @Override
    public void chat() {
        System.out.println("Oppo Chat");
    }

    @Override
    public void camera() {
        System.out.println("Oppo Camera");
    }

    @Override
    public void internet() {
        System.out.println("Oppo Internet");
    }

}

class SamsungS10 implements ISmartPhone
{
    @Override
    public void audioCall()
    {
        System.out.println("Samsung AudioCall");
    }

    @Override
    public void smsText()
    {
        System.out.println("Samsung SmsText");
    }
    @Override
    public void videoCall()
    {
        System.out.println("Samsung VideoCall");
    }

    @Override
    public void chat()
    {
        System.out.println("Samsung Chat");
    }

    @Override
    public void camera()
    {
        System.out.println("Samsung Camera");
    }

    @Override
    public void internet()
    {
        System.out.println("Samsung Internet");
    }
}

public class Example16 {
    public static void main(String[] args) {
        AppleIphoneOne appleIphoneOne = new AppleIphoneOne();
        OppoSmartA9 oppoSmartA9 = new OppoSmartA9();
        SamsungS10 samsungS10 = new SamsungS10();

        appleIphoneOne.audioCall();
        appleIphoneOne.videoCall();

        // Parent Can Hold The Object Of Child Class
        ///  Method Overshadowing In Java
        ISmartPhone apple = new AppleIphoneOne();
        Object apple1 = new AppleIphoneOne();

        ISmartPhone oppo = new OppoSmartA9();
        oppo.audioCall();
        oppo.camera();

        ISmartPhone samsung = new SamsungS10();
        samsung.camera();
        samsung.chat();


    }
}

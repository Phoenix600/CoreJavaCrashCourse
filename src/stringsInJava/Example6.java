package stringsInJava;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        String data1 = "ABC";
        String data2 = "abc";

        String res = data1 + data2;
        System.out.println(res); // ABCabc

        res = data1.concat(data2);
        System.out.println(res); // ABCabc

        int x; // Variable Declaration
        int y = 12; // Variable Declaration And Initialization
        res = data2 + data1;  //abcABC
        System.out.println(res);

        res = data2.concat(data1);
        System.out.println(res); //abcABC

        String errorProneString = "                   Pranay         ";
        System.out.println(errorProneString);

        String correctedString = errorProneString.trim();
        System.out.println(correctedString); //Pranay

        String myData = "Ronin";
        byte[] barr = myData.getBytes();
        for(int i=0; i<barr.length; i++)
        {
            System.out.println(barr[i]);
        }

        char[] carr = myData.toCharArray(); //{'R','o','n','i','n'};
        for(int i=0; i<carr.length; i++)
        {
            System.out.println(carr[i]);
        }

        String data_name = "Pranay";
        String replacedString = data_name.replace('a','A');
        System.out.println(data_name);
        System.out.println("Replaced Data : " + replacedString);


        String myLongContent = "I Still See Your Shadows In My Room";
        String result2 = myLongContent.replaceAll("ee","EE");
        System.out.println(result2);

        String lyric = "No One Cares How You Feel, Its All About Making Dollar Bills Feel";
        String newString = lyric.replaceFirst("Feel","FEEL");
        System.out.println(newString);

        byte[] arr =  newString.getBytes();
        for(byte u1: arr)
        {
            System.out.println(u1);
        }
    }
}

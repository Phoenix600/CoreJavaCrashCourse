package stringsInJava;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args)
    {
        String data1  = new String("Sample Strinag");

        int length = data1.length();
        System.out.println("Length : " + length);

        boolean flag = data1.isBlank();
        System.out.println("Is Blank : " + flag);

        flag = data1.isEmpty();
        System.out.println("Is Empty : " + flag);

        char x = data1.charAt(11);
        System.out.println("Char : " + x);

        int index = data1.indexOf('a'); //97
        System.out.println("Index of a from L-R : " + index);

        index = data1.lastIndexOf(97);
        System.out.println("Last Index of a from R-L : " + index);

        String artist = "Juice WRLD";
        String popArtist = "Juice WRLD";
        String rapperArtist = new String("Juice WRLD");

        flag = (artist == popArtist);
        System.out.println("Are They Same : " + flag);

        flag = (rapperArtist == popArtist);
        System.out.println("Are They Same : " + flag);

        flag = rapperArtist.equals(artist);
        System.out.println("Are They Same ContentWise : " + flag);

        String myList = "MILK BREAD TEA COFFEE GALI";
        String[] sArr= myList.split(" ");
        System.out.println(Arrays.deepToString(sArr));

        String myData = "I'm not you say I'm";
        String changedString = myData.replace('y','Y'); // I'm not You saY I'm
        System.out.println("Replaced String : " + changedString);

       flag =  myData.contains("A");
       System.out.println("Present Or Not : " + flag);

       String mySubString = myData.substring(3,myData.length());
       System.out.println("SubString From 3-9 : " + mySubString);

       String errProneString = "            mydata            ";
       System.out.println(errProneString);
       String removedSpaces = errProneString.strip();
       System.out.println(removedSpaces);

    }
}

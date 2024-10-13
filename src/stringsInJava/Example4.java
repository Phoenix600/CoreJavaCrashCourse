package stringsInJava;

public class Example4 {
    public static void main(String[] args)
    {
        String data = "Sample S";
        char x = data.charAt(4);
        System.out.println(x);

        int x1 = data.indexOf('e');
        System.out.println(x1);

        String d1 = "";
        boolean result = d1.isEmpty();
        System.out.println("Empty : " + result);

        String d2 = new String();
        result = d2.isEmpty();
//        System.out.println(d2.isEmpty());
        System.out.println(result);

        String d3 = new String("ABCCAB");
        result = d3.endsWith("CAB");
        System.out.println("Ends With " + result);

        result = d3.startsWith("ABC");
        System.out.println(result);


        String myFavoriteLyrics = "No One Cares How You Feel, It's All About Making Dollar Bills";
        String res = myFavoriteLyrics.toLowerCase();
        System.out.println(res);


        String myName = new String("PranayBabu");
        String myNameLs = "PranayBabu";

        System.out.println(myNameLs == myName);
        System.out.println(myNameLs.compareTo(myName));
        System.out.println(myName.equals(myNameLs));

        System.out.println(myNameLs.hashCode());
        System.out.println(myName.hashCode());


        System.out.println("Pranay".contains("ana"));
        String myname = "Pranay";
        String myNameAnother = "Pranay";
        System.out.println(myname.equals(myNameAnother));
        System.out.println(myname.compareTo(myNameAnother));
        System.out.println("Pranay".compareTo("Pranay"));
    }
}

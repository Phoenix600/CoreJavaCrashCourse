package wrapperClassesInJava;

public class Example5
{
    public static void main(String[] args) {
//        Character character = new Character('A');
        Character char1 = 'A';

        // Static Members
        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MIN_RADIX);
        // binary ==> 2   => 0/1
        // decimal ==> 10 ==> 0,1,2,3,4,,5,6,7,8,9
        System.out.println("Are They Same : " + Character.compare('a','A'));
        String chars = Character.toString('A');
        System.out.println("Chars String : " + chars);
    }
}

package wrapperClassesInJava;

public class Example5
{
    public static void main(String[] args) {
//      Character character = new Character('A');
        Character char1 = 'A';

        // Static Members
        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MIN_RADIX);

        int asciiCode =  Character.digit('A',10);
        System.out.println("ASCII Code ");
        // Static Methods
        System.out.println("Are They Same : " + Character.compare('a','A'));

        String chars = Character.toString('A');
        System.out.println("Chars String : " + chars);

        boolean result = Character.isDigit('1');
        System.out.println("Is Digit : " + result);
    }
}

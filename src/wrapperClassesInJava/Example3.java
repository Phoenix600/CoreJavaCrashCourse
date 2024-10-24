package wrapperClassesInJava;

public class Example3 {
    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = false;
        Boolean b3 = true;

        boolean result =Boolean.logicalAnd(b1,b2);
        System.out.println("AND  : " + result);

        result = Boolean.logicalOr(b1,b2);
        System.out.println("OR :  " + result);

        result = Boolean.logicalXor(b1,b2);
        System.out.println("XOR-1 : " + result);

        result = Boolean.logicalXor(b1,b3);
        System.out.println("XOR-2 : " + result);

        result = Boolean.parseBoolean("True");
        System.out.println("Converted Boolean Data : " + result);

        int flag = Boolean.compare(false, true);
        System.out.println("Flag Data : " + flag);

        System.out.println(b1.equals(b2));
    }
}

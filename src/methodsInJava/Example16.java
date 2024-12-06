package methodsInJava;

public class Example16 {

    public static void PrintArray(int A[])
    {
        for(int x : A)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        PrintArray(nums);
    }
}

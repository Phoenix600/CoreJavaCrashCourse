package methodsInJava;

public class Example3 {
    public static void displayArray(int nums[])
    {
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println();
    }

    public static void changeArrayElement(int nums[], int element, int position)
    {
        nums[position] = element;
    }

    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        displayArray(A);

        int element  = 99;
        int position = 3;

        changeArrayElement(A,element,position);
        displayArray(A);
    }
}

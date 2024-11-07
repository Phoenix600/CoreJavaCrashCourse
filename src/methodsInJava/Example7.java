package methodsInJava;

public class Example7 {

    public int getMaxElementFromArray(int nums[])
    {
        int max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = {54,34,99,-100};
        Example7 myObject = new Example7();
        System.out.println(myObject.getMaxElementFromArray(nums));
    }
}

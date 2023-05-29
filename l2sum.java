//leet code day 1
import java.util.*;

class l2sum {
    public static int[] inputarray()
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		return a;
	}
	public static void printarray(int[] a)
	{
		int n=a.length;
		System.out.print("[");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("]");
	}
	
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] == target - nums[i])
                    return new int[] { i, j };
        return null;
    }
    public static void main(String args[])
    {
        int [] a = inputarray();
        Scanner s=new Scanner (System.in);
        int t=s.nextInt();
        int[]b=twoSum(a,t);
		printarray(b);
    }
}

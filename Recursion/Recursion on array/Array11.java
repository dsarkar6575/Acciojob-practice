import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static int array11(int[] nums, int index) {
  if (index >= nums.length) return 0;
  if (nums[index] == 11) return 1 + array11(nums,index+1);
  else return array11(nums,index+1);
}

	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(array11(arr,0));
      
	}
}

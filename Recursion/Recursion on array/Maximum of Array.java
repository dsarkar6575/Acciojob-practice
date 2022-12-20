import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,n);
        System.out.print(result);
    }

    public static int maxElement(int[] arr,int n){

		if(n==0)
			return arr[0];
		return Math.max(arr[n-1],maxElement(arr,n-1));
    }
}

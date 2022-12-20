import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int arr[]=findX(arr1,0,x,0);
		for(int a: arr)
			{
				System.out.print(a+" ");
			}
    }



    static int[] findX(int arr[], int n, int x,int count)
    {
        // write code here
	
		if(n==arr.length)
		{
			return new int[count];
		}
		
		if(x==arr[n])
		{
			count++;
		}
		int s[]=findX(arr,n+1,x,count);
		if(arr[n]==x)
		{
			s[count-1]=n;
		}
		return s;
		
      
    }
}

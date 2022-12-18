import java.io.*;
import java.util.*;

class Main
{
   static void printStar(int i)
	{
		if(i==0) return;
		System.out.print("* ");
		printStar(i-1);
	}
	static void h(int n,int i)
	{
		if(n<i) return;
		printStar(i);
		System.out.println();
		h(n,i+1);
	}
	public static void solve(int n)
    {
        // Your code here
		h(n,1);
        
    }
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
static int fibo(int n)
  {
    if(n==1)
    {
    return 0;
     }
    if(n==2)
    {
      return 1;
    }
   return fibo(n-1)+fibo(n-2);
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=fibo(n);
      System.out.println(k);
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  static  String star="";
  public static void printstar(String s,int n)
  {
  
     star+=s.charAt(n);
    if(n==s.length()-1)
    {
      return;
    }
    if(s.charAt(n)==s.charAt(n+1))
    {
      star+='*';
    }
    printstar(s,n+1);
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      printstar(s,0);
      System.out.println(star);
      
	}
}

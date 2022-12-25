import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  
  public static int countabc(String s)
  {
    int count=0;
    if(s.length()<3)
    {
      return 0;
    }
    if(s.substring(0,3).equals("abc") || s.substring(0,3).equals("aba"))
    {
      return 1+countabc(s.substring(2));
    }
    else
    {
      return countabc(s.substring(1));
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
      System.out.println(countabc(s));
	}
}

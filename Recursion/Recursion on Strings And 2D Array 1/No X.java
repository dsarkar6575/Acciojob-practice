import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static String noX(String s)
  {
    if(s.length()==0)
      return s;

    if(s.charAt(0)=='x')
      return noX(s.substring(1));
    return s.charAt(0)+noX(s.substring(1));
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      System.out.println(noX(s));
	}
}

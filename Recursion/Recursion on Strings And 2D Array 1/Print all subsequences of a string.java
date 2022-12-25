import java.util.*;
import java.util.Scanner;

public class Main{
	static void helper(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}

		helper(s.substring(1),ans+s.charAt(0));
		helper(s.substring(1),ans);
	}
    static void printSubsequence(String s) {
        //Write your code here
		helper(s,"");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}

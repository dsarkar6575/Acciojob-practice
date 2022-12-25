import java.io.*;
import java.util.*;

public class Main {
	static String word[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	static void helper(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		int d1=ch-'0';
		String words=word[d1];
		for(int i=0;i<words.length();i++)
			{
				helper(s.substring(1),ans+words.charAt(i));
			}
	}
    static void printKPC(String ques) {
        //Write your code here
		helper(ques,"");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str);
    }
}

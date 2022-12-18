import java.util.*;

public class Main {
	static void printword(int N)
    {
		if(N==0)
		{
			return;
		}
        //Write your code here
		
		System.out.println("AccioSchool");
		printword(N-1);
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
	    printword(n);
    }
}

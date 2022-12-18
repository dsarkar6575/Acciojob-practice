import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int X,N;
        X = sc.nextInt();        
        N = sc.nextInt();

        System.out.println(power(X,N));		
    }

	public static long power(int x, int y)
    {
		//Write code here
		if(y==0) return 1;
		long pow=power(x,y/2);
		long sqr=pow*pow;
		if(y%2!=0)
		{
			sqr=x*sqr;
		}
		return sqr;
    }
}

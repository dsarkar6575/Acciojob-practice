import java.util.*;
import static java.lang.Math.ceil;

public class Main {
	static long mod=(long)Math.pow(10,9)+7;
	static long NthEvenFibonacci(long n) {
        //Write your code here
		if(n<1)
			return n;
		if(n==1) return 2;
		return ((4*NthEvenFibonacci(n-1))+NthEvenFibonacci(n-2))%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}

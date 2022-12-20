import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindromic(arr,0, n-1));
    }

	

    public static boolean isPalindromic(int[] arr, int begin, int end) {
    // Write your code here
		if(begin>=end) return true;
		if(arr[begin]==arr[end])
		{
			return isPalindromic(arr,begin+1,end-1);
		}else{
			return false;
		}
    }
}

import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, n));
    }

	public static int recforMin(int[] arr, int n) {
        //Write your code here
		if(n==0)
			return arr[0];
		return Math.min(arr[n-1],recforMin(arr,n-1));
    }
}

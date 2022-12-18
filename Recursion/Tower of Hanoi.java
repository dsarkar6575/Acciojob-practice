import java.util.Scanner;

public class Main {

    static void towersOfHanoi(int n, char source, char dest,char axe) {
        if(n==0) return;
		towersOfHanoi(n-1,source,axe,dest);
		System.out.println("Moving ring "+n+" from "+ source+" to "+axe);
		towersOfHanoi(n-1,dest,source,axe);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'C','B'); // move n disks from A to B
    }
}

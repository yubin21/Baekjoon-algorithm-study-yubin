import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n, l;
		n = sc.nextInt();
		l = n;
		for(int i = 1; i <= n; i++) {
			l -= 1;
			for(int j = l; j > 0; j--)
				System.out.print(" ");
			for (int k = i; k > 0; k--)
				System.out.print("*");
			System.out.println();
		}
	}
}

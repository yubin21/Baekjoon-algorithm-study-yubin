import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, num, sum;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sum = n2*n1;
		while(n2 != 0) {
			num = n2 % 10;
			n2 /= 10;
			System.out.println(num*n1);
		}
		System.out.println(sum);
	}

}

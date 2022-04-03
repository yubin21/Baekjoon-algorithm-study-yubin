import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		int max = A;
		//세 수가 같을때
		if (A == B && B == C)
			System.out.println(10000 + (1000 * A));
		else if(A != B && B != C && A != C) {
			if(max < B)
				max = B;
			if(max < C)
				max = C;
			System.out.println(100 * max);
		}
		else {
			if(A != B)
				System.out.println(1000 + (100 * C));
			else if(A != C)
				System.out.println(1000 + (100 * B));	
		}
	}

}

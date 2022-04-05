import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, total = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
			total += i;
		
		System.out.println(total);
	}

}

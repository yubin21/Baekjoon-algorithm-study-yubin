import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String ans;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else 
			System.out.println("==");
		
	}

}

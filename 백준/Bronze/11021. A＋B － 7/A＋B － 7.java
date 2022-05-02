import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, a, b;
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for (i = 0; i < t; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			arr[i] = a+b;
		}
		
		for (i = 0; i < t; i++)
			System.out.println("Case #" + (i+1) +": " + arr[i]);			
		
	}

}
//백준 11021번.
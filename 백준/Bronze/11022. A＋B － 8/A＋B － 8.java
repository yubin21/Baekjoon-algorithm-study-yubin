import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i;
		int t = sc.nextInt();
		int arr[] = new int[t];
		int arrA[] = new int[t];
		int arrB[] = new int[t];
		
		for (i = 0; i < t; i++)
		{
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
			
			arr[i] = arrA[i]+arrB[i];
		}
		
		for (i = 0; i < t; i++)
			System.out.println("Case #" + (i+1) +": " + arrA[i] +" + "+ arrB[i]+" = "+ arr[i]);			
		
	}

}
//백준 11022번.
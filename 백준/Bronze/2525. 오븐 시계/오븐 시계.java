import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int h, m, time;
	        h = sc.nextInt();
	        m = sc.nextInt();
	        time = sc.nextInt();
	        m += time;
	        while(m >= 60) {
	        	h += 1;
	            m -= 60;
	        }
	        if (h >= 24)
	            h -= 24;
	        System.out.println(h+" "+m);
	}

}

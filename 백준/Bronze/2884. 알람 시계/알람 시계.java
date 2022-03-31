// 2884
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        if (m < 45) {
            h -= 1;
            m += 15;
        }
        else
            m -= 45;
        if (h < 0)
            h += 24;
        System.out.println(h+" "+m);
    }
}
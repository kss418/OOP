import java.util.Scanner;


public class Main {
    static int gcd(int n, int m){
        if(m == 0) return n;
        int mx = (m > n ? m : n);
        int mn = (m > n ? n : m);
        return gcd(mn, mx % mn);
    }

    public static void main(String[] args) {
        System.out.print("두 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int g = gcd(n, m);

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", g);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n; n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("수를 입력하세요: ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int mx = arr[0], mn = arr[0];
        for(int i = 1;i < n;i++){
            mx = (mx > arr[i]) ?  mx : arr[i];
            mn = (mn < arr[i]) ? mn : arr[i];
        }

        System.out.printf("최대값: %d\n", mx);
        System.out.printf("최소값: %d\n", mn);
    }
}

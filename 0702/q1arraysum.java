import java.util.Scanner;
public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 讀取數字個數
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // 讀取每個整數
            sum += num;             // 累加
        }

        System.out.println(sum); // 輸出總和
        System.out.println(n);   // 輸出個數
    }
}
    


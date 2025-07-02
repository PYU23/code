import java.util.Scanner;
public class q2seqsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 陣列長度
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 讀入陣列
        }

        int key = sc.nextInt(); // 要搜尋的值
        int ops = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            ops++; // 每比對一次就加 1
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(ops); // 輸出比對次數
    }
}
    

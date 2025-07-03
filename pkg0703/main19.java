 import java.util.Scanner;
public class main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

    

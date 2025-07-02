import java.util.Scanner;
public class q7permutation {
    static int ops = 0;
    public static void permute(int[] nums, boolean[] used, int[] current, int depth, int n) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(current[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
            ops++; 
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                current[depth] = nums[i];
                permute(nums, used, current, depth + 1, n);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        int[] current = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1; // 建立 {1, 2, ..., n}
        }
        permute(nums, used, current, 0, n);
        System.out.println(ops);
    }
}
    


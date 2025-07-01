public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];  
        for (int i = 0; i < 2; i++) {         
            for (int j = 0; j < 2; j++) {     
                System.out.print("計算位置 c[" + i + "][" + j + "]：");
                int sum = 0;
                for (int k = 0; k < 2; k++) { 
                    int product = a[i][k] * b[k][j];
                    sum += product;
                    System.out.print(a[i][k] + "*" + b[k][j]);
                    if (k < 1) {
                        System.out.print(" + ");
                    } else {
                        System.out.print(" = ");
                    }
                }
                System.out.println((a[i][0] * b[0][j]) + " + " + (a[i][1] * b[1][j]) + " = " + sum);
                c[i][j] = sum;
            }
        }

        // 輸出結果矩陣
        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

                

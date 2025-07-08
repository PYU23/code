public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }
    public static void printReport(int[] scores) {
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }
            char grade = getGrade(score);
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }
        double average = (double) sum / scores.length;
        int countAboveAvg = 0;
        for (int score : scores) {
            if (score > average) countAboveAvg++;
        }
        double ratioAboveAvg = 100.0 * countAboveAvg / scores.length;
        System.out.println("========== 學生成績報告 ==========");
        System.out.println("總學生數: " + scores.length);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.println("最高分: " + max + " (學生編號: " + maxIndex + ")");
        System.out.println("最低分: " + min + " (學生編號: " + minIndex + ")");
        System.out.println("等級統計:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.printf("高於平均分學生比例: %.2f%%\n", ratioAboveAvg);
        System.out.println("----------------------------------");
        System.out.println("學生編號 | 分數 | 等級");
        System.out.println("----------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%6d | %3d | %c\n", i, scores[i], getGrade(scores[i]));
        }
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(scores);
    }
}


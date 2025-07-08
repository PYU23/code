public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] data = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int target1 = 67;
        int index1 = findElement(data, target1);
        int count1 = countOccurrences(data, target1);
        if (index1 != -1) {
            System.out.println("數字 " + target1 + " 的索引位置為: " + index1);
        } else {
            System.out.println("找不到數字 " + target1);
        }
        System.out.println("數字 " + target1 + " 出現次數: " + count1);
        int target2 = 100;
        int index2 = findElement(data, target2);
        int count2 = countOccurrences(data, target2);
        if (index2 != -1) {
            System.out.println("數字 " + target2 + " 的索引位置為: " + index2);
        } else {
            System.out.println("找不到數字 " + target2);
        }
        System.out.println("數字 " + target2 + " 出現次數: " + count2);
    }
}

    


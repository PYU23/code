import java.util.Arrays;
public class ArrayUtility {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("陣列中至少要有兩個元素");
        }
        int largest = Integer.MIN_VALUE;//
        int second = Integer.MIN_VALUE;//
        for (int num : array) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("陣列中沒有第二大的不同元素");
        }
        return second;
    }
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        System.out.print("原始陣列: ");
        printArray(data);
        int[] copied = copyArray(data);
        System.out.print("複製陣列: ");
        printArray(copied);
        reverseArray(data);
        System.out.print("反轉後陣列: ");
        printArray(data);


        int secondLargest = findSecondLargest(copied); 
        System.out.println("第二大數值: " + secondLargest);
    }
}

    


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Scanner scanner = new Scanner(System.in);
//
//        for(int j = 0; j < array.length; j++){
//            System.out.print("array: ");
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//            boolean newArray = true;
//            for (int num : array) {
//                if (num != 0) {
//                    newArray = false;
//                    break;
//                }
//            }
//            System.out.print("Pick a number from array: ");
//            int numberToZero = scanner.nextInt();
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == numberToZero) {
//                    array[i] = 0;
//                }
//            }
//            System.out.println("array: " + Arrays.toString(array));
//        }


        // 2
//        int[] prices = {7, 1, 5, 3, 6, 4};
//
//        if (prices == null || prices.length < 2) {
//            System.out.println("Maximum Profit: 0");
//            return;
//        }
//
//        int minPrice = prices[0];
//        int maxProfit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            } else if (prices[i] - minPrice > maxProfit) {
//                maxProfit = prices[i] - minPrice;
//            }
//        }
//
//        System.out.println("Maximum Profit: " + maxProfit);

        // 3
//        int[] array = {1, 0, 2, 1};
//
//        boolean isPalindrome = true;
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            if (array[left] != array[right]) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if (isPalindrome) {
//            System.out.println("Array is palindrome");
//        } else {
//            System.out.println("Array is not palindrome");
//        }

        // 4
//        Scanner scanner = new Scanner(System.in);
//        int[] array = {1, 1, 3, 1, 4, 5, 1, 1, 6, 1, 1};
//
//        System.out.println("array: " + Arrays.toString(array));
//
//        System.out.print("Pick a number from Array: ");
//        int numberToRemove = scanner.nextInt();
//
//        ArrayList<Integer> resultList = new ArrayList<>();
//
//        for (int num : array) {
//            if (num != numberToRemove) {
//                resultList.add(num);
//            }
//        }
//
//        System.out.println("New Array: ");
//        for (int nun : resultList) {
//            System.out.print(nun + " ");
//        }
    }
}
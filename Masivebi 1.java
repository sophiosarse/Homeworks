import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        // 1
        int[] b = new int[12];
        Random rand = new Random();

        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100);
        }
        for (int n : b) {
            System.out.print(n + " ");
        }
        //2
        int sum = 0;
        int mul = 1;
        int arith = 0;
        for(int i = 0; i < b.length; i++){
            sum += b[i];
            mul *= b[i];
            arith += b[i];
        }
        arith = arith / b.length;
        System.out.println();
        System.out.println(sum + ", " + mul + ", " + arith);
        */

        /*
        // 3
        int[] b = new int[20];
        int sum = 0;
        int mul = 1;
        int arith = 0;
        Random rand = new Random();
        for (int i = 0; i < b.length; i++){
            b[i] = rand.nextInt(20);
        }
        for (int n : b) {
            System.out.print(n + " ");
        }
        System.out.println();
        int min = b[0];
        int max = b[0];
        for (int i = 0; i < b.length; i++){
            if(min > b[i]){
                min = b[i];
            }
            if (max < b[i]){
                max = b[i];
            }
        }
        System.out.println("maximum is: " + max);
        System.out.println("minimum is: " + min);
        */

        /*
        // 4
        int[] b = new int[15];
        int x = 10;
        int a = 0;
        int sum = 0;
        int mul = 1;
        int arith = 0;
        for (int i = 0; i < b.length; i++){
            b[i] = 1 + i;
            sum += b[i];
            mul *= b[i];
            arith += b[i];
            if(b[i] == x){
                a = 1;
            }
        }
        arith /= b.length;
        for (int n : b) {
            System.out.print(n + " ");
        }
        // 5
        System.out.println();
        System.out.println(sum + ", " + mul + ", " + arith);

        // 6
        if(a == 1){
            System.out.println(x + " Gvxvdeba");
        }else{
            System.out.println(x + " Ar Gvxvdeba");
        }
        */

        /*
        // 7
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        int index = 0;
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println("New array: " + Arrays.toString(newArr));
        */

        /*
        // 8
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 10;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(x == arr[i] + arr[j]){
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
        */

        /*
        // 9
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number from array: ");
        int numberToRemove = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            if (num != numberToRemove) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num != numberToRemove) {
                newArray[index++] = num;
            }
        }
        System.out.print("New array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        */

        /*
        // 10
        // საწყისი მთელი რიცხვების მასივი
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);

        for(int j = 0; j < array.length; j++){
            System.out.print("array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            boolean newArray = true;
            for (int num : array) {
                if (num != 0) {
                    newArray = false;
                    break;
                }
            }
            System.out.print("Pick a number from array: ");
            int numberToZero = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == numberToZero) {
                    array[i] = 0;
                }
            }
            System.out.println("array: " + Arrays.toString(array));
        }
        */
    }
}
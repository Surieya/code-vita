
import java.util.Arrays;
import java.util.Scanner;

public class ExchangeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        int flag = 0;

        char[] num1Array = Integer.toString(num1).toCharArray();

        Arrays.sort(num1Array);

        permute(num1Array, 0, num1Array.length - 1, num2, flag);

        if (flag == 1) {
            System.out.println(new String(num1Array));
        } else {
            System.out.println(-1);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void permute(char[] arr, int l, int r, int num2, int flag) {
        if (flag == 1) {
        }

        if (l == r) {
            int currentNum = Integer.parseInt(new String(arr));

            if (currentNum > num2) {
                System.out.println(currentNum);
            }
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);

            permute(arr, l + 1, r, num2, flag);

            swap(arr, l, i);
        }
    }
}

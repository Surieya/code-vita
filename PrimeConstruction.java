import java.util.ArrayList;
import java.util.Scanner;

public class PrimeConstruction {
    public static void main(String[] a) {
        try (Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            int p = sc.nextInt();

            int part = d / p;
            int temp = part;
            int cnt = 0;
            for (int i = 1; i <= p; i++) {
                ArrayList<Integer> ans = new ArrayList<>();
                int comp = 0;

                while (temp >= 1) {
                    comp = i + p;
                    ans.add(comp);
                    temp--;
                }

                cnt += checkPrime(ans);
                temp = part;
            }

            System.out.println(cnt);
        }
    }

    static int checkPrime(ArrayList<Integer> ans) {
        for (int num : ans) {
            if (!isPrime(num)) {
                return 0;
            }
        }
        return 1;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
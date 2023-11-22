import java.util.Scanner;

public class coinDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, one = 0, five = 0, two = 0, mod;
        n = scanner.nextInt();

        if (n <= 5) {
            mod = n - 1;
            one += (mod % 2) + 1;
            two += mod / 2;
        } else {
            mod = n % 5;
            five = (n / 5) - 1;

            if (mod % 2 == 1)
                one = 2;
            else
                one = 1;

            two = (n - ((five * 5) + one)) / 2;
        }

        System.out.println((five + two + one) + " " + one + " " + two + " " + five);
    }
}

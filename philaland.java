import java.util.Scanner;

public class philaland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) (Math.log(n) / Math.log(2)) + 1);
    }
}

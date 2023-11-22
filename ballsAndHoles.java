import java.util.Scanner;

//ip
//h = 3 b = 11;
//H = 21 3 6
//B = 20 15 5 7 10 4 2 1 3 6 8;
//op 1 0 3 0 0 3 3 2 2 0 0;
public class ballsAndHoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int[] H = new int[h];
        int[] B = new int[b];

        for (int i = 0; i < h; i++) {
            H[i] = sc.nextInt();
        }
        for (int j = 0; j < b; j++) {
            B[j] = sc.nextInt();
        }
        int[] capacity = new int[h];
        for (int l = 0; l < h; l++) {
            capacity[l] = l + 1;
        }
        for (int k = 0; k < b; k++) {
            int flag = 0;
            for (int m = h - 1; m >= 0; m--) {
                if (B[k] <= H[m] && capacity[m] != 0) {
                    System.out.print(m + 1 + " ");
                    capacity[m]--;
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.print('0' + " ");
            }
        }
    }
}

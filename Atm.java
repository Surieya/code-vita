import java.util.Scanner;

class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] deno = { 100, 200, 500, 1000 };
        int amt = sc.nextInt();
        int maxDeno = sc.nextInt();
        // System.out.print(amt);
        // System.out.print(maxDeno);
        int mDeno = 0;
        for (int i = deno.length - 1; i >= 0; i--) {
            System.out.print(mDeno);
            int gotDeno = 0;
            int sum = 0;
            int tempAmt = amt;
            while (sum != tempAmt) {
                if (deno[i] <= tempAmt) {
                    tempAmt -= deno[i];
                    gotDeno++;
                } else {
                    for (int j = i - 1; j >= 0; j--) {
                        if (deno[i] <= tempAmt) {
                            tempAmt -= deno[i];
                            gotDeno++;

                        }
                    }
                }
            }
            if (gotDeno > mDeno && gotDeno <= maxDeno) {
                mDeno = gotDeno;
            }
        }
        System.out.println(mDeno);
    }
}
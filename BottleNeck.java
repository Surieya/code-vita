import java.util.*;

public class BottleNeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
        int max = -1;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (m.containsKey(temp)) {
                m.put(temp, m.getOrDefault(temp, 0) + 1);
                max = Math.max(max, m.get(temp));

            } else {
                m.put(temp, 1);
            }
        }
        System.out.println(max);
    }
}

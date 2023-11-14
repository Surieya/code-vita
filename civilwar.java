import java.util.*;

public class civilwar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List powers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            powers.add(scanner.nextInt());
        }

        Collections.sort(powers, new Comparator() {
            @Override
            public int compare(Integer a, Integer b) {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return Integer.compare(b, a);
                }
                return Integer.compare(absB, absA);
            }
        });
        int teamAPower = 0;
        int teamBPower = 0;
        System.out.println(powers);
        boolean ironmanTurn = true;
        for (int i = 0; i < N; i++) {
            if (ironmanTurn) {
                int temp = teamAPower;
                teamAPower += powers.get(i);
            } else {
                teamBPower += powers.get(i);
            }
            ironmanTurn = !ironmanTurn;
        }
        int powerDifference = Math.abs(teamAPower - teamBPower);
        System.out.println(powerDifference);
    }

}

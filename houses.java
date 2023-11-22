import java.util.Scanner;

public class houses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = 0;
        int o = 0;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                e += sc.nextInt();
            }else{
                o += sc.nextInt();
            }
        }
        if(o > e){
            System.out.println(o);
        }else{
            System.out.println(e);
        }
    }
}

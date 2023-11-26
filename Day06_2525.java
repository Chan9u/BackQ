import java.util.Scanner;

public class Day06_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();

        int resM = M+X;
        int resH = H;
        boolean sw = true;
        while(sw) {
            if (resH == 24) {
                resH = 0;
            }
            if (resM >= 60) {
                resM -= 60;
                resH++;
            } else {
                sw = false;
            }
        }
        System.out.println(resH + " " + resM);
    }
}

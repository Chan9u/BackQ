import java.util.Scanner;

public class Day05_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), M = sc.nextInt();

        M -= 45;
            if (M < 0) {
                M += 60;
                H--;
            }
            if(H < 0){
                H += 24;
            }
        System.out.print(H + " " + M);
    }
}

import java.util.Scanner;

public class Day01_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1; // 결과를 1로 초기화합니다.

        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("음수의 팩토리얼은 정의되지 않습니다.");
        } else if(a == 0){
            res = 1;
        }
        else {
            for (int i = 1; i <= a; i++) {
                res *= i;
            }
            System.out.println(res);
        }

        sc.close();
    }
}
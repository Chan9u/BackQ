import java.util.Scanner;

public class Day04_144365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() , y = sc.nextInt();
        int res = 0;
        if(x > 0 && y > 0){
            res = 1;
        }
        else if(x > 0 && y < 0){
            res = 4;
        }
        else if(x < 0 && y > 0){
            res = 2;
        }
        else{
            res = 3;
        }
        System.out.println(res);
    }
}

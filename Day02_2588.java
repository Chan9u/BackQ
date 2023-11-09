import java.util.Scanner;

public class Day02_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        String x = Integer.toString(B);
        int fcount = 1;
        int[] res = new int[x.length()-1];
        for(int sw = 0; sw < x.length()-1; sw++){
            if(sw == 0){
                res[sw] = A*(B%10);
            }
            else{
                res[sw] = A*((B/(10*fcount)%10));
                fcount=fcount*10;
            }
        }
        for(int sw = 0;sw < x.length()-1; sw++){
            System.out.println(res[sw]);
        }
        System.out.println(A*(B/(10*fcount)));
        System.out.print(A*B);
    }
}

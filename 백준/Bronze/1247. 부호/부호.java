import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i ++){
            int N = sc.nextInt();
            BigInteger S = BigInteger.ZERO;
            for(int j = 0; j < N; j ++){
                BigInteger x = sc.nextBigInteger();
                S = S.add(x);
            }
            if(S.compareTo(BigInteger.ZERO) == 0){
                System.out.println(0);
            }else if(S.compareTo(BigInteger.ZERO) == -1){
                System.out.println("-");
            }else{
                System.out.println("+");
            }
        }
    }

}
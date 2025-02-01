import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2부터 계속 나누는데, 결과가 0이 아니면 계속 증가해서 나눈다.
        // 나눠질 때마다 출력도 하기
        // N은 나눠진 이후에 값 변경 필요 (N == 1이면 끝)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = 2;
        while(N != 1){
            if(N%r != 0){
                r++;
            }else{
                if(N/r == 0){
                    System.out.println(r);
                    break;
                }
                N/=r;
                System.out.println(r);
                r = 2;
            }
        }
    }
}
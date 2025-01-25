import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 이렇게 하면 틀렸다고 나옴
//        float A = sc.nextInt();
//        float B = sc.nextInt();
//        int N = sc.nextInt();
//        int temp = 1;
//        for(int i = 0; i < N ;i++){ temp *= 10; }
//        A = A / B * temp % 10;
//        System.out.println((int)A);

        // 한번에 계산하는 방식이 안되므로, 나머지 계산법을 활용
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int ans = A % B;  // 4
        for(int i = 0; i < N; i++){
            A = A % B * 10 ;
            ans = A / B;
        }
        System.out.println(ans);


    }
}
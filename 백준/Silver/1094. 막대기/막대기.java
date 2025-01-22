import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 64, 32, 16, 8, 4, 2, 1
        // 이진수에서의 1의 갯수
        // 23
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(N > 0){
            if(N%2 == 1){
                count++;
            }
            N/=2;
        }
        System.out.println(count);
    }
}
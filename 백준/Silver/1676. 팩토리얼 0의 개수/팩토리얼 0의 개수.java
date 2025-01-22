import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 0의 개수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++) {
            int num = i;
            while(num%5 == 0){  // 5의 배수를 카운트 해야된다. 
                count++;
                num /= 5;
            }
        }
        System.out.println(count);
    }
}
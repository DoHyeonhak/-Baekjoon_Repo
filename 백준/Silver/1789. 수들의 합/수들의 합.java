import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
        // N이 최댓값이 되려면 가장 작은 자연수 1부터 순차적으로 계속 더해지는 것이 적합하다.

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0L;
        int num = 1;
        while(sum <= N){
            sum += num++;
        }
        System.out.println(num - 2);

    }
}
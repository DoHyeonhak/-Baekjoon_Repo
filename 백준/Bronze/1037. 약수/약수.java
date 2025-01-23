import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        while(N-- > 0){
            int number = sc.nextInt();
            if(number > max) max = number;
            if(number < min) min = number;
        }
        System.out.println(max * min);


    }
}
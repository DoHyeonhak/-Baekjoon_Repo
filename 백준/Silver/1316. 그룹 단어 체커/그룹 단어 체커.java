import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        while(N-- > 0){
            String input = sc.next();
            String temp = input.charAt(0) + "";
            boolean flag = true ;
            for(int i = 1; i < input.length(); i++) {
                // 전에 나왔던 문자와 같으면 계속
                // 전에 나왔던 문자와 다르면
                //  1. 새로운 문자가 나왔거나
                //  2. 이전에 나왔던 문자가 새로 나왔을 가능성 존재
                if(input.charAt(i) != input.charAt(i - 1)) {
                    for(int j = 0; j < temp.length(); j++) { // 이전에 나온 문자가 나왔는지 확인
                        if(input.charAt(i) == temp.charAt(j)) {
                            flag = false;
                            break;
                        }
                    }
                    temp += input.charAt(i);    // 새로운 문자에 대하여 추가
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
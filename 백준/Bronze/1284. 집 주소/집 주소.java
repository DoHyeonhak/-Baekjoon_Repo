import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 각 숫자 사이에는 1cm 여백
        // 1은 2, 0은 4, 나머지는 3cm 여백
        // 양 끝 여백 1
        // 0 누르면 종료
        Scanner sc = new Scanner(System.in);
        while(true){
            String n = sc.next();
            if(n.equals("0")) break;
            int cnt = 2;
            cnt += n.length() - 1;
            for(int i = 0; i < n.length(); i++){
                if(n.charAt(i) == '1'){
                    cnt += 2;
                }else if(n.charAt(i) == '0'){
                    cnt += 4;
                }else{
                    cnt += 3;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
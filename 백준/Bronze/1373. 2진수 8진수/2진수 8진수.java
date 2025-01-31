import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        String N = sc.nextLine();
        int size = N.length();
        if(size%3 == 1) N = "00" + N;
        if(size%3 == 2) N = "0" + N;

        for(int i = 0; i < N.length(); i+=3){
            String temp = N.substring(i, i+3);
            int a = (N.charAt(i)-'0')*4;
            int b = (N.charAt(i+1)-'0')*2;
            int c = (N.charAt(i+2)-'0');
            ans.append(a+b+c);
        }
        System.out.println(ans);
    }
}
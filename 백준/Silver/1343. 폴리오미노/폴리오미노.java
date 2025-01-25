import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s1 = input.replaceAll("XXXX", "AAAA");
        String s2 = s1.replaceAll("XX", "BB");
        if(s2.contains("X")) {
            System.out.println(-1);
        }else{
            System.out.println(s2);
        }

//        런타임 에러        
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String ans = "";
//        int count = 0;
//        for(int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) == '.') {
//                if(input.charAt(i - 1) == '.') {
//                    ans += '.';
//                    continue;
//                }
//                if(count %2 == 1){
//                    System.out.println(-1);
//                    return;
//                }
//                for(int j = 0; j < count/4; j++){
//                    ans += "AAAA";
//                }
//                if(count%4 == 2) ans += "BB";
//                count = 0;
//                ans += '.';
//            }else{
//                count++;
//            }
//        }
//        if(count%2 == 1){
//            System.out.println(-1);
//            return;
//        }
//        for(int j = 0; j < count/4; j++){
//            ans += "AAAA";
//        }
//        if(count%4 == 2) ans += "BB";
//        System.out.println(ans);
    }
}
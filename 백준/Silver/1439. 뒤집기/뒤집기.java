import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String input = sc.nextLine();
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) != input.charAt(i - 1)) {
                count++;
            }
        }
        if(count%2 == 0){
            System.out.println(count/2);
        }else{
            System.out.println(count/2+1);
        }

    }
}
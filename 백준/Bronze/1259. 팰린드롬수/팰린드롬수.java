import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            boolean check = true;
            if(str.equals("0")) break;
            for(int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i)!=str.charAt(str.length()-i-1)) check = false;
            }
            if(check) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }
}
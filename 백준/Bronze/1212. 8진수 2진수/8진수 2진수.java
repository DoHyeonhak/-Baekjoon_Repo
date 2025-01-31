import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N;
        N = br.readLine();
        for(int i = 0; i < N.length(); i++) {
            char temp = N.charAt(i);
            if(temp == '0'){
                str.append("000");
            }else if(temp == '1'){
                str.append("001");
            }else if(temp == '2'){
                str.append("010");
            }else if(temp == '3'){
                str.append("011");
            }else if(temp == '4'){
                str.append("100");
            }else if(temp == '5'){
                str.append("101");
            }else if(temp == '6'){
                str.append("110");
            }else if(temp == '7'){
                str.append("111");
            }
        }
        if(str.charAt(0) == '0') str.deleteCharAt(0);
        if(str.charAt(0) == '0') str.deleteCharAt(0);
        System.out.println(str);
    }
}
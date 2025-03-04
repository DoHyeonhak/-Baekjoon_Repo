import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.length()%3==1) str = "00"+str;
        if(str.length()%3==2) str = "0"+str;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i+=3){
            int num = Integer.parseInt(str.substring(i, i+3));
            int a = (num/100)*4;
            int b = ((num/10)%10)*2;
            int c = (num%10);
            sb.append(a+b+c);
        }
        System.out.println(sb.toString());
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(true){
            int number = N;
            boolean flag = true;
            while(number > 0){
                if(number%10==4||number%10==7){
                    number/=10;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(N);
                break;
            }else{
                N--;
            }

        }
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        for(int i = N-1; i >= 1; i--) {
            if(str[i] == 'A') {
                if(str[i-1] == 'A') {
                    str[i-1] = 'A';
                }else if(str[i-1] == 'C') {
                    str[i-1] = 'A';
                }else if(str[i-1] == 'G') {
                    str[i-1] = 'C';
                }else if(str[i-1] == 'T') {
                    str[i-1] = 'G';
                }
            }else if(str[i] == 'C') {
                if(str[i-1] == 'A') {
                    str[i-1] = 'A';
                }else if(str[i-1] == 'C') {
                    str[i-1] = 'C';
                }else if(str[i-1] == 'G') {
                    str[i-1] = 'T';
                }else if(str[i-1] == 'T') {
                    str[i-1] = 'G';
                }
            }else if(str[i] == 'G') {
                if(str[i-1] == 'A') {
                    str[i-1] = 'C';
                }else if(str[i-1] == 'C') {
                    str[i-1] = 'T';
                }else if(str[i-1] == 'G') {
                    str[i-1] = 'G';
                }else if(str[i-1] == 'T') {
                    str[i-1] = 'A';
                }
            }else if(str[i] == 'T') {
                if(str[i-1] == 'A') {
                    str[i-1] = 'G';
                }else if(str[i-1] == 'C') {
                    str[i-1] = 'G';
                }else if(str[i-1] == 'G') {
                    str[i-1] = 'A';
                }else if(str[i-1] == 'T') {
                    str[i-1] = 'T';
                }
            }
        }
        System.out.println(str[0]);
    }
}
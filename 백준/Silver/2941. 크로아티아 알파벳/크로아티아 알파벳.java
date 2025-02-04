import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //크로아티아 알파벳	변경
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        int cnt = 0;
        for(int i = 0; i < croatian.length; i++) {
            str = str.replace(croatian[i], "r");
        }
        cnt = str.length();
        System.out.println(cnt);
    }

}
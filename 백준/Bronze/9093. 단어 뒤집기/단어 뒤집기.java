import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            String s = br.readLine();
            String[] words = s.split(" ");
            for(int j = 0; j < words.length; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
    }

}
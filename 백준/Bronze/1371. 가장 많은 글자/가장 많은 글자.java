import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int max = 0;
        String input;
        String str = "";

        //  && !input.isEmpty()
        while((input = br.readLine()) != null) {
            str += input;
        }

        for(int i = 0; i < str.length(); i++) {
            // 알파벳인 경우와 아닌 경우 분리
            // max보다 크면 max 업데이트
            if(str.charAt(i) != ' ') {
                alphabet[str.charAt(i) - 'a']++;
                if(alphabet[str.charAt(i) - 'a'] > max) {
                    max = alphabet[str.charAt(i) - 'a'];
                }
            }
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(max == alphabet[i]) {
                System.out.print((char)(i + 'a'));
            }
        }

    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        Integer[] arr = new Integer[number.length()];
        for (int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
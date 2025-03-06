import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String number = Integer.toString(a*b*c);
        int[] arr = new int[10];
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == '0') {
                arr[0]++;
            }else if(number.charAt(i) == '1') {
                arr[1]++;
            }else if(number.charAt(i) == '2') {
                arr[2]++;
            }else if(number.charAt(i) == '3') {
                arr[3]++;
            }else if(number.charAt(i) == '4') {
                arr[4]++;
            }else if(number.charAt(i) == '5') {
                arr[5]++;
            }else if(number.charAt(i) == '6') {
                arr[6]++;
            }else if(number.charAt(i) == '7') {
                arr[7]++;
            }else if(number.charAt(i) == '8') {
                arr[8]++;
            }else if(number.charAt(i) == '9') {
                arr[9]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
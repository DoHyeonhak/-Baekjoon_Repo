import java.util.*;
import java.io.*;

public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        stack = new int[N];
        for(int i = 1; i <= N; i++) {
            String cmd = sc.next();
            if(cmd.equals("push")) {
                int num = sc.nextInt();
                push(num);
            }else if(cmd.equals("pop")) {
                System.out.println(pop());
            }else if(cmd.equals("top")){
                System.out.println(top());
            }else if(cmd.equals("size")){
                System.out.println(size);
            }else if(cmd.equals("empty")){
                System.out.println(empty());
            }
        }
    }
    public static void push(int num){
        stack[size++] = num;
    }

    public static int pop(){
        if(size == 0){
            return -1;
        }else{
            int temp = stack[--size];
            return temp;
        }
    }
    public static int empty(){
        if(size == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int top(){
        if(size == 0){
            return -1;
        }else{
            return stack[size - 1];
        }
    }
}
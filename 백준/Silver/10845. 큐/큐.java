import java.util.*;
import java.io.*;

public class Main {
    public static int[] queue;
    public static int front = 0;
    public static int back = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        queue = new int[10000];
        for(int i = 0; i < N; i++) {
            String cmd = sc.next();
            if(cmd.equals("push")) {
                int number = sc.nextInt();
                push(number);
            }else if(cmd.equals("pop")) {
                System.out.println(pop());
            }else if(cmd.equals("front")) {
                System.out.println(front());
            }else if(cmd.equals("back")) {
                System.out.println(back());
            }else if(cmd.equals("size")) {
                System.out.println(back - front);
            }else if(cmd.equals("empty")) {
                System.out.println(empty());
            }
        }
    }
    public static void push(int num) {
        queue[back++] = num;
    }
    public static int pop() {
        if(front == back) {
            return -1;
        }else{
            int temp = queue[front++];
            return temp;
        }
    }
    public static int empty(){
        if(front == back) {
            return 1;
        }else{
            return 0;
        }
    }
    public static int front(){
        if(front == back) {
            return -1;
        }else{
            return queue[front];
        }
    }
    public static int back(){
        if(front == back) {
            return -1;
        }else{
            return queue[back - 1];
        }
    }
}
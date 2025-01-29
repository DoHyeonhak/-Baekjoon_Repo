import java.util.*;

public class Main {
    public static void main(String[] args) {
        // remove 함수는 제거하고 제거 대상 반환도 해준다
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            que.add(i);
        }
        while(!que.isEmpty()) {
            arr.add(que.remove());
            if(!que.isEmpty()) {
                que.add(que.remove());
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
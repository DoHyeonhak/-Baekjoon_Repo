import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최소 힙
        MinHeap heap = new MinHeap();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){   // 0이 나온 만큼 출력해야 된다.
                System.out.println(heap.poll());
            }else{
                heap.insert(num);
            }
        }
    }
}

class MinHeap{
    ArrayList<Integer> heap;
    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0);    // 인덱스를 편하게 사용하기 위함
    }

    public void swap(int idx_a, int idx_b){
        int temp = heap.get(idx_a);
        heap.set(idx_a, heap.get(idx_b));
        heap.set(idx_b, temp);
    }

    public void insert(int v){
        heap.add(v);
        int idx = heap.size() - 1;
        while(idx > 1 && heap.get(idx) < heap.get(idx/2)){  // 새로 들어온 노드가 부모 노드보다 작다면 (swap)
            swap(idx, idx/2);
            idx /= 2;
        }
    }

    public int poll(){
        if(heap.size()==1) return 0;    // 비어있는 경우
        int deletedValue = heap.get(1);    // idx 1인 값이 최소이므로 반환값
        heap.set(1, heap.get(heap.size()-1));   // 가장 뒤에 있는 값을 빈 노드로 이동
        heap.remove(heap.size()-1); // 교한된 값을 제거
        int idx = 1;    // 맨 뒤 값을 가져왔으므로 다시 정렬하기 위한 인덱스 설정

        while(idx*2 < heap.size()){ //하위로 가면서 반복
            int childValue = heap.get(idx*2);
            int childIdx = idx*2;
            //만약 오른쪽 자식노드가 존재하는데 오른쪽 자식노드가 왼쪽 자식노드보다 더 작으면
            //오른쪽 노드와 부모노드를 교체할 준비

            // 자식노드가 부모노드보가 크다면
            if(2*idx+1<heap.size() && childValue > heap.get(2*idx+1)){
                childValue = heap.get(2*idx+1);
                childIdx = 2*idx+1;
            }

            // 자식노드가 부모노드보다 작거나 같으면
            if(heap.get(idx) <= childValue) break;

            //부모와 자식 교체
            swap(childIdx, idx);
            idx = childIdx;
        }
        return deletedValue; //최소값(index가 1이었던 값) 반환
    }
}
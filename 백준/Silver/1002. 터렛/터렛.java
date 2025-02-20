import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int ans = 0;
        int x1, y1, x2, y2, r1, r2;
        double l;
        StringTokenizer st;
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            l = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);

            if(x1==x2&&y1==y2&&r1==r2) {    // 두 원이 일치
                ans = -1;
            }else if(l > Math.pow(r1+r2, 2)){   // 겹치지 않음
                ans = 0;
            }else if(l < Math.pow(r2-r1, 2)){   // 포함하지만 겹치지 않음
                ans = 0;
            }else if(l == Math.pow(r2+r1, 2)){  // 외접
                ans = 1;
            }else if(l == Math.pow(r2-r1, 2)){  // 내접
                ans = 1;
            }else if(l < Math.pow(r1+r2, 2)){   // 2개
                ans = 2;
            }
            System.out.println(ans);
        }
    }
}
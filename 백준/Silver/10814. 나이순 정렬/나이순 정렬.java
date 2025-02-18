import java.util.*;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String arr[][] = new String[n][2];
        in.nextLine();

        for(int i = 0; i < n; i ++){
            String[] str = in.nextLine().split(" ");
            if(str.length == 2){
                arr[i][0] = str[0];
                arr[i][1] = str[1];
            }
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0] == o2[0]){
                    return 1;
                }else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for(int i = 0; i < n; i ++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}

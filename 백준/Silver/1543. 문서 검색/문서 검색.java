import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        // indexOf(특정문자열을, 특정위치에서 시작)
        int index = doc.indexOf(word);
        while (index != -1) {
            count++;
            // 검색된 인덱스의 시작 위치에서 찾는 문자열 길이만큼 더하면 검색되지 않는 영역이 나온다
            index = doc.indexOf(word, index + word.length());
        }
        System.out.println(count);
    }
}
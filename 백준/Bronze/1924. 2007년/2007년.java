import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 2007 1월 1일은 월요일
        // 1, 3, 5, 7, 8, 10, 12 는 31
        // 4, 6, 9, 11은 30, 2는 28일
        // SUN, MON, TUE, WED, THU, FRI, SAT
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int days = 0;
        // 일수 계산
        if(month == 1){
            days = day;
        }else if(month == 2){
            days = 31 + day;
        }else if(month == 3){
            days = 31 + 28 + day;
        }else if(month == 4){
            days = 31 + 28 + 31 + day;
        }else if(month == 5){
            days = 31 + 28 + 31 + 30 + day;
        }else if(month == 6){
            days = 31 + 28 + 31 + 30 + 31 + day;
        }else if(month == 7){
            days = 31 + 28 + 31 + 30 + 31 + 30 + day;
        }else if(month == 8){
            days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
        }else if(month == 9){
            days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
        }else if(month == 10){
            days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30+ day;
        }else if(month == 11){
            days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
        }else{
            days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        }
        // 요일 계산
        if(days % 7 == 1){
            System.out.println("MON");
        }else if(days % 7 == 2){
            System.out.println("TUE");
        }else if(days % 7 == 3){
            System.out.println("WED");
        }else if(days % 7 == 4){
            System.out.println("THU");
        }else if(days % 7 == 5){
            System.out.println("FRI");
        }else if(days % 7 == 6){
            System.out.println("SAT");
        }else{
            System.out.println("SUN");
        }
    }
}
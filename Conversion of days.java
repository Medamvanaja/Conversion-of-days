import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.print("enter days:");
        int days=in.nextInt();
        int years=(days/365);
        int months=(days%365)/30;
        int weeks=((days%365)%30)/7;
            days=((days%365)%30)%7;
            System.out.println("year/s =" +years);
            System.out.println("month/s =" +months);
            System.out.println("week/s =" +weeks);
            System.out.println("day/s =" +days );
    }
}

import java.util.Scanner;

public class LeapYear {

   public static void main(String[] args){
       NumberFormatter nf = new NumberFormatter();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a year: ");
       int year = sc.nextInt();

        System.out.println(nf.formatNumber(year));


    }
}


import java.util.Scanner;

public class ParkingCharge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
            System.out.println(n*100);
        }else if(n<=5){
            System.out.println(200+(n-2)*50);
        }else{
            System.out.println(350+(n-5)*20);
        }
        sc.close();
    }
}

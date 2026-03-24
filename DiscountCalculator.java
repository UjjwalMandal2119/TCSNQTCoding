
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n=sc.nextDouble();
        //int n =sc.nextInt();
        if(n<0 || n==0){
        System.out.println("Error");
        
        }else{
          if(n<1000){
        System.out.println(n*95/100);
       }else if( n<=5000) {
        System.out.println(n*90/100);
       }else{
        System.out.println(n*85/100 );
       }
        }
            

      
    sc.close();
        }
            
}

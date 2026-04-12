
import java.util.Scanner;

public class TogglingAllBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String bn="";
        while(n>0){
            int rem=n%2;
            bn= rem +bn;
            n=n/2;
        }
        int l=bn.length();
        int sum=0;
        for(int i=0; i<l; i++){
         if(bn.charAt(i)=='0'){
            sum+=Math.pow(2, l-i-1);
         }
        }
        System.out.println(sum);
    }
}

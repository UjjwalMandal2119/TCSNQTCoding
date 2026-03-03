
import java.util.Scanner;


// you are given two Integers L and R , representing a range of numbers(inclusive)
// A number is called a Cryptic Number if it satisfies all of the following conditions:
//   1. It is divisible by 7
//   2. It is not divisible by 5
//   3. It is not a palindrome
//   4. It does not contain any repeated digits.


public class CrypticNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int R =sc.nextInt();
        for(int i=L ;i<=R; i++){
            if(i%7==0 && i%5!=0 && (!isPalindrome(i)) &&(!isrepeatedDigits(i)) ){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int n){
        int num =n;
        int res=0;
        while(n>0){
            int r=n%10;
            res=res *10 +r;
            n=n/10;
        }
        return num==res;
    }

    public static boolean isrepeatedDigits(int n){
       int [] arr = new int[10];
       
       while(n>0){
        int digit = n %10;
        if(arr[digit]== 1){
            return true;
        }
        arr[digit]=1;
        n=n/10;
       }
       return false;

    }
}

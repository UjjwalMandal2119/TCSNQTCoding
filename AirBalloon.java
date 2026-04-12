
import java.util.*;

public class AirBalloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] weight = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
        }
        int y=sc.nextInt();

        System.out.println(maxPeople(weight, y));
        System.out.println("------------------------");
         System.out.println(maxPeople1(weight, y));

    }
    public static int maxPeople(int[] w, int y){
     Arrays.sort(w);
      int sum=0; 
      int count=0;
      for(int i=0; i<w.length; i++){
        if(sum +w[i] <=y){
            sum+=w[i];
            count++;
        }else{
            break;
        }
      }
      return count;
    }
    public static int maxPeople1(int[] arr , int y){
        int sum=0;
        int index=0;
        int count=0;
        int maxCap=0;
        for(int i=0; i<arr.length; i++){
            if(sum <=y){
                sum+=arr[i];
                count++;
            }else{
                sum-=arr[index];
                index++;
                count--;
            }
            maxCap =Math.max(maxCap, count);
        }
        return maxCap;
    }
}

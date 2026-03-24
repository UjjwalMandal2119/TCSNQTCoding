
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
}

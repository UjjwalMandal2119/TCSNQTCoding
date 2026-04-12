
import java.util.HashMap;
import java.util.Scanner;

public class Max_Min_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        String s= sc.nextLine();
        String [] parts = s.split(" ");
        int [] arr = new int[parts.length];
        for(int i=0; i<parts.length; i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        for(int i=0; i<arr.length; i++){
          if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
          }else{
            map.put(arr[i], 1);
          }
        }
        int min= arr[0];
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(map.get(min)>map.get(arr[i])){
                min=arr[i];
            }else if(map.get(max)<map.get(arr[i])){
                max=arr[i];
            }

            
        }
 System.out.println( min +" " + max);

    }
}

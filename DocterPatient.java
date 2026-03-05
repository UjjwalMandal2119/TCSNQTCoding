
import java.util.Scanner;

public class DocterPatient {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
      int payment =0;
      int count=0;
      while(count<20){
        String input = sc.nextLine();
        if(input.isEmpty()){
            
          break;
        }

        int age = Integer.parseInt(input);

        if(age<=0 || age>120){
           System.out.println("Invalid Input");
           return;
        }

        if(age <17){
            payment +=200;
        }else if(age<=40){
            payment +=400;
        }else{
            payment+=300;
        }
        count++;
      }
       System.out.println(payment);

    }
}

class Bbc{
   // int count =0;
     static int count =0; //class level variable only one time calling avialbe for call method

     int m=100;
    public Bbc() {  // it give the total object
    count++;
    }

  //static block execute onces , and it called before the main method

  static {
    System.out.println("I am exwcute first ");
  }

    // void display(){
    //     System.out.println(count);
    // }

    static  void display(){  // in main we directly call it for class name
        System.out.println(count);
       // System.out.println(m);   //static method are not allowed to call non static variable, method
       //Instance variable ko call nhi kar sakta h
    }
    
}
public class StaticDetails {
    public static void main(String[] args) {
        Bbc A1 = new Bbc();
        Bbc A2 = new Bbc();
        Bbc A3 = new Bbc();
        Bbc.display();  //class ke name ke sath call kar sakta hu
    }
}

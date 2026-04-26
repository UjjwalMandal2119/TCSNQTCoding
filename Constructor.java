class Abc{
    int a, b;
    public Abc() {
    System.out.println("this is a constructor");
    }

    public Abc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(){
        System.out.println(a+b);
    }
    
}
public class Constructor {
    public static void main(String[] args) {
        Abc d; //d is declare object
        Abc a= new Abc(); //a is define object
        Abc B =a; // B is reference Object
        d=new Abc(4,6); //now d is define
        d.add();
    }
}

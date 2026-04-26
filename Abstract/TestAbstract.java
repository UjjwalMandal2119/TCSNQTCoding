package Abstract;
abstract class Area{
    abstract void area();
}

class Circle extends Area{
    void area(){
        double r=12.44, A, PI=3.14;
        A=PI*r*r;
        System.out.println("Area of circle " + A);
    }
}

class Rectangle extends Area{
    void area(){
        double l=10.5, w=20.4, A;
        A=l*w;
        System.out.println("Area of rectangle " + A);
    }
}

public class TestAbstract {
    public static void main(String[] args) {
       Area A1=new Circle();
       A1.area();
       Area A2 = new Rectangle();
       A2.area(); 
    }
}

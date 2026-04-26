interface Area{
    double PI=3.14;
    void area();
}

class Circle implements Area{
    public void area(){
        double r=23.5, A;
        A=PI*r*r;
        System.out.println("Area of circle " + A);
    }
}

class Rectangle implements Area{
    public void area(){
        double l=9.5, w=4.5;
        double A=l*w;
        System.out.println("Area of Rectangle" + A);
    }
}


public class Test_Interface {
    public static void main(String[] args) {
        Area A1= new Circle();
        A1.area();
        Area A2 = new Rectangle();
        A2.area();
    }
}

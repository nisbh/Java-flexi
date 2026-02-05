abstract class Calculator{

    abstract void calculate(int a,int b);
}
class Addition extends Calculator{
    void calculate(int a,int b) {
        System.out.println("Sum= "+(a+b));
    }
}

class Multiplication extends Calculator{
    void calculate(int a,int b) {
        System.out.println("Product= "+(a*b));
    }
}

public class AbstractCalculator{
    public static void main(String[] args){
        Calculator c1=new Addition();
        c1.calculate(10,5);
        Calculator c2=new Multiplication();
        c2.calculate(10,5);
    }
}

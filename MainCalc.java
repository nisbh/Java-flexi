import java.util.Scanner;

class Calculator1{
    double a,b;
    Calculator1(double a,double b){
        this.a=a;
        this.b=b;
    }
    void calculate(int choice){
        switch(choice){
            case 1->System.out.println("Sum:"+(a+b));
            case 2->System.out.println("SUb:"+(a-b));
            case 3->System.out.println("Mul:"+(a*b));
            case 4->{
                if (b==0)
                    System.out.println("Division by zero not allowed");
                else
                    System.out.println("Div = " + (a / b));
            }
            default->System.out.println("Invalid Choice");
        }
    }
}
public class MainCalc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double x=sc.nextDouble();
        System.out.println("Enter second number:");
        double y=sc.nextDouble();
        System.out.println("1.Add  2.Sub  3.Mul  4.Div");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        Calculator1 c = new Calculator1(x, y);
        c.calculate(choice);
    }
}
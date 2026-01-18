public class Calculator{
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Addition ="+new Calculator().add(10,5));
}
}

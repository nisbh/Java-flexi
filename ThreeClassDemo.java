class A{
    int x=10;
}

class B{
    int y=20;
}
public class ThreeClassDemo{
    public static void main(String[] args) {

        A objA=new A();
        B objB=new B();
        ThreeClassDemo objC=new ThreeClassDemo();

        System.out.println(objA.x);
        System.out.println(objB.y);
        System.out.println("This is Class ThreeClassDemo");
    }
}
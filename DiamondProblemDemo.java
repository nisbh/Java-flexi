interface a{
    default void show(){
        System.out.println("Show from A");
    }
}
interface b{
    default void show(){
        System.out.println("Show from B");
    }
}
class c implements a,b{
    public void show(){
        a.super.show();
        b.super.show();
        System.out.println("Show from C");
    }
}
public class DiamondProblemDemo{
    public static void main(String[] args){
        c obj=new c();
        obj.show();
    }
}
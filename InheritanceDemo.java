class Parent{
    String name="parent class";
    void show(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child Method");

    }
}
public class InheritanceDemo{
    public static void main(String[] args){
        Child obj=new Child();
        obj.show();
        obj.display();
        System.out.println(obj.name);
    }
}
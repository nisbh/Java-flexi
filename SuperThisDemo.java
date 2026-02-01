class Parent{
    String name="Parent Class";
    Parent(){
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{
    String name="Child Class";
    Child(){
        super();
        System.out.println("Child constructor");
    }
    void display(String name){
        System.out.println("Local name: "+name);      
        System.out.println("Child name: "+this.name);   
        System.out.println("Parent name: "+super.name); 
    }
}

public class SuperThisDemo{
    public static void main(String[] args){
        Child obj=new Child();
        obj.display("Method Parameter");
    }
}

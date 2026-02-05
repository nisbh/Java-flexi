abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("This is food");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
public class AbstractExample{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}//write program in java where we use abstract keyword to design calculator app

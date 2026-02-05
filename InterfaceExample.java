interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
public class InterfaceExample{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}//write program in java to implement interface to solve diamond problem
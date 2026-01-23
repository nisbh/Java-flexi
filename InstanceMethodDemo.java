class Greeting {

    void sayHello() {
        System.out.println("Hello from instance method");
    }
}
public class InstanceMethodDemo {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello();
    }
}

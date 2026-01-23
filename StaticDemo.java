class Student1 {
    String name;
    int rollNo;
    static String college = "VIT Pune";

    Student1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Rahul", 101);
        Student1 s2 = new Student1("Anita", 102);

        s1.display();
        s2.display();
    }
}

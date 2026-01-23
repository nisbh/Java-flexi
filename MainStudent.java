import java.util.Scanner;

class Student{
    String name;
    int rollno;
    long prn;

    Student(String name,int rollno,long prn){
        this.name=name;
        this.rollno=rollno;
        this.prn=prn;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll No.:"+rollno);
        System.out.println("PRN:"+prn);
    }
}
public class MainStudent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter roll number:");
        int rollno=sc.nextInt();
        System.out.println("Enter PRN:");
        long prn=sc.nextLong();
        Student s=new Student(name,rollno,prn);
        s.display();
    }
}
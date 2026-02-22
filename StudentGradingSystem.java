class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    void assignGrade() throws InvalidMarksException{
        if (marks <0 ||marks>100){
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        if (marks>=90)
            System.out.println("Grade: A");
        else if (marks>=75)
            System.out.println("Grade: B");
        else if (marks>=60)
            System.out.println("Grade: C");
        else if (marks>=40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");
    }
}
public class StudentGradingSystem{
    public static void main(String[] args){
        Student s1=new Student("Rahul",85);
        Student s2=new Student("Anita",120);
        try {
            System.out.println("Student: "+s1.name);
            s1.assignGrade();
            System.out.println("\nStudent: "+s2.name);
            s2.assignGrade();
        }
        catch(InvalidMarksException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
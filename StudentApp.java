import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    List<Double>grades=new ArrayList<>();
    public Student(String name){ this.name=name;}
    public String getName(){return name;}
    public void addGrade(double grade){grades.add(grade);}
    public double calculateAverage(){
        if (grades.isEmpty()) return 0.0;
        double sum=0;
        for (double g:grades)sum+=g;
        return sum/grades.size();
    }
    public void displayStudentDetails(){
        System.out.printf("Student: %-10s | Grades: %-15s | Average: %.2f%n", 
                          name, grades.toString(), calculateAverage());
    }
}
class GradeManager{
    List<Student>students=new ArrayList<>();
    public void addStudent(Student student){students.add(student);}
    public Student findStudentByName(String name){
        for (Student s:students){
            if (s.getName().equalsIgnoreCase(name)) return s;
        }
        return null;
    }
    public void displayAllStudents(){
        for (Student s:students)s.displayStudentDetails();
    }
}
public class StudentApp{
    public static void main(String[] args){
        GradeManager gm=new GradeManager();
        Student alice=new Student("Alice");
        alice.addGrade(95.0);
        alice.addGrade(88.5);
        Student bob=new Student("Bob");
        bob.addGrade(72.0);
        bob.addGrade(81.0);
        gm.addStudent(alice);
        gm.addStudent(bob);
        System.out.println("System Records:");
        gm.displayAllStudents();
    }
}
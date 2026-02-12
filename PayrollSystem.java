import java.util.ArrayList;
import java.util.List;

class Employee{
    private String employeeId, name, role;
    private double baseSalary, currentSalary;
    public Employee(String id,String name,String role,double base){
        this.employeeId=id;
        this.name=name;
        this.role=role;
        this.baseSalary=base;
        calculateSalary();
    }
    public final void calculateSalary(){
        switch(role.toLowerCase()){
            case"manager":currentSalary=baseSalary*1.20; break;
            case"developer":currentSalary=baseSalary*1.10; break;
            case"designer":currentSalary=baseSalary*1.05; break;
            case"intern":currentSalary=1000.0; break;
            default:currentSalary=baseSalary;
        }
    }
    public void applyDeduction(double amount){currentSalary -= amount;}
    public void displayEmployeeDetails(){
        System.out.println("ID:"+employeeId+"Name:"+name+"Role:"+role+"Final Salary:$"+currentSalary);
    }
    public String getEmployeeId(){return employeeId;}
}
class Payroll{
    private List<Employee>employees=new ArrayList<>();
    public void addEmployee(Employee e){employees.add(e);}
    public void calculateAllSalaries(){
        for(Employee e:employees){
            e.calculateSalary();
            e.displayEmployeeDetails();
        }
    }
}
public class PayrollSystem{
    public static void main(String[] args){
        Payroll payroll=new Payroll();
        Employee dev=new Employee("E01","Bob","Developer",5000.0);
        dev.applyDeduction(200.0);
        payroll.addEmployee(dev);
        payroll.calculateAllSalaries();
    }
}
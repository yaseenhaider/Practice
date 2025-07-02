class studentRecord {
    private String degree;
    public studentRecord() {
    }
    public void setDegree(String deg) {
        degree = deg;
    }
    public String getDegree() {
        return degree;
    }
}
class employeeRecord {
    private int emp_id;
    private double salary;
    public employeeRecord() {
    }
    public void setEmp_id(int id) {
        emp_id = id;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setSalary(int sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}
class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private studentRecord stu;
    public Manager(String t, double d, employeeRecord e, studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:");
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : " + stu.getDegree());
    }
}
public class Runner {
    public static void main(String args[]) {
        studentRecord s1 = new studentRecord();
        s1.setDegree("software engineering");
        employeeRecord e = new employeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Manager m1 = new Manager("financeManager", 5000, e, s1);
        m1.display();
    }
}
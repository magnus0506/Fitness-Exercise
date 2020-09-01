public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public String toString(){
        return  "Employee: " + getName() +
                "\nCPR: " + getCpr() +
                "\nHours: " + getHours() +
                "\nSalary: " + getSalary() + "\n";
    }
}

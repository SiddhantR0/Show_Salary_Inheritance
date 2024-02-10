package Models;

public class Employee extends Member {
    String Department;

    public Employee(String name, int age, int contact, String address, double salaryPerDay, String department) {
        super(name, age, contact, address, salaryPerDay);
        Department = department;
    }
    @Override
    public double getSalary(int notWorkingDays) {
        int workingDays = 24 - notWorkingDays;
        return salaryPerDay * workingDays;
    }
}

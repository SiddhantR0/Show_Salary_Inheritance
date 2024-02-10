package Models;

public class Manager extends Member {
    String specialization;

    public Manager(String name, int age, int contact, String address, double salaryPerDay, String specialization) {
        super(name, age, contact, address, salaryPerDay);
        this.specialization = specialization;
    }
}

package Models;

public class Member {
    String Name;
    int age;
    int contact;
    String address;
    double salaryPerDay;

    public Member(String name, int age, int contact, String address, double salaryPerDay) {
        Name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
    public double getSalary(int leavesPerMonth){
        int workingDays = 24 - leavesPerMonth;
        double totalSalary = salaryPerDay * workingDays;
        System.out.println(Name +"'s"+" total salary is: " +" $" + totalSalary);
        return totalSalary;
    }
}

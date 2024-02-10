import Models.Employee;
import Models.Manager;

public class Main{
    public static void main(String[] args) {

        Manager m1 = new Manager("Ram",18,29829,"Ktm", 50, "Video Edit");

        m1.getSalary(2);

        Employee e1 = new Employee("Sita",21,9876,"Brt",30,"IT");

        e1.getSalary(0);
    }
}
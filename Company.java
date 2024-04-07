import employees.Employee;
import employees.Worker;
import employees.Manager;
public class Company {
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
          
        employees[0] = new Manager("Person One", 6000, 0);
        employees[1] = new Worker("Person Two", 5000, "worker");
        employees[2] = new Employee("Person Three", 5500);
        employees[3] = new Employee("Person Four", 5800);
        employees[4] = new Worker("Person Five", 5100, "worker");

        int nonManagerEmployeesCount = 0;
          for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
            nonManagerEmployeesCount++;
            }
        }
        
        ((Manager)employees[0]).setNumberOfSubordinates(nonManagerEmployeesCount);

        employees[0].setSalary(7500);
        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

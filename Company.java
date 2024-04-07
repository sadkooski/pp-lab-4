import employees.Employee;
import employees.Worker;
import employees.Manager;
public class Company {
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
          
        employees[0] = new Manager("Person One", 6000, 0);
        employees[1] = new Worker("Person Two", 5000, "worker");
        employees[2] = new Employee("Person Three", 5500);
        employees[3] = new Employee("Person Four", 5800);
        employees[4] = new Worker("Person Five", 5200, "worker");
        employees[5] = new Manager("Person Six", 5800, 0);
        employees[6] = new Worker("Person Seven", 5200, "worker");

        int nonManagerEmployeesCount = 0;

          for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary + 500);

            if (!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            } 
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setSalary(7500);
                ((Manager) employee).setNumberOfSubordinates(nonManagerEmployeesCount);
            }
        }

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

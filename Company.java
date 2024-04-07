
public class Company {
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Person One", 50000.0);
        employees[1] = new Employee("Person Two", 60000.0);
        employees[2] = new Employee("Person Three", 55000.0);
        employees[3] = new Employee("Person Four", 52000.0);
        employees[4] = new Employee("Person Five", 58000.0);

        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);

        employees[3].setSalary(100000.0);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

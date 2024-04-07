
public class Company {
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Person One", 7000);
        employees[1] = new Employee("Person Two", 6000);
        employees[2] = new Employee("Person Three", 5500);
        employees[3] = new Employee("Person Four", 5200);
        employees[4] = new Employee("Person Five", 5800);

        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);

        employees[3].setSalary(10000);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

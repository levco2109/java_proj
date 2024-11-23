public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 3000);
        Employee employee2 = new Employee("Jane", "Smith", 4000);

        System.out.printf("%s %s's yearly salary: $%.2f%n", 
                          employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: $%.2f%n", 
                          employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.printf("%nAfter 10%% raise:%n");
        System.out.printf("%s %s's yearly salary: $%.2f%n", 
                          employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: $%.2f%n", 
                          employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
    }
}


public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee("Minel Ceylan",7500,57,2021);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee);
    }
}
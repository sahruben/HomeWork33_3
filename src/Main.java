public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов", 1400),
                new Employee("Петров", 2500),
                new Employee("Сидоров", 3200)

        };

        double totalSalary = SalaryCalculator.calculateTotalSalary(employees);
        System.out.println("Сумма зарплат всех сотрудников: " + totalSalary);
    }
}


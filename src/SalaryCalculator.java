
public class SalaryCalculator {

    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}

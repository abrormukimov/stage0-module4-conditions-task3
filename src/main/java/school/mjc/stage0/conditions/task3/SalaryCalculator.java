package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
            salary *= 85 / 100;
            System.out.println(salary);
        } else if (salary > 10000 && salary <= 20000) {
            salary *= 82 / 100;
            System.out.println(salary);
        } else if (salary > 20000) {
            salary *= 80 / 100;
            System.out.println(salary);
        } else if (salary <= 0) {
            System.out.println("wrong input!");
        }
    }
}

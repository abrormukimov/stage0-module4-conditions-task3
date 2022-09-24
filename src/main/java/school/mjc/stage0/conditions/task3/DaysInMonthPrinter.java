package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month <= 0 || month > 31) {
            System.out.println("wrong number!");
        }
        if (month == 1) {
            System.out.println(31);
        } else if (month == 2) {
            System.out.println(28);
        } else if (month == 3) {
            System.out.println(31);
        } else if (month == 4) {
            System.out.println(30);
        } else if (month == 5) {
            System.out.println(31);
        } else if (month == 6) {
            System.out.println(30);
        } else if (month == 7) {
            System.out.println(31);
        } else if (month == 8) {
            System.out.println(31);
        } else if (month == 9) {
            System.out.println(30);
        } else if (month == 10) {
            System.out.println(31);
        } else if (month == 11) {
            System.out.println(30);
        } else if (month == 12) {
            System.out.println(31);
        }
    }
}

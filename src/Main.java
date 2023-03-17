import java.util.Scanner;

public class Main {
    public static void getStaffData(Employee [] staff){
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
            System.out.println("---");
        }
    }
    public static void getTotalSalary(Employee [] staff){
        double totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            totalSalary += staff[i].getSalary();
        }
        System.out.println("Общая зарплата сотрудников равна " + totalSalary + " рублей");
        System.out.println("---");
    }
    public static void getMinSalary(Employee [] staff){
        double minSalary = staff[0].getSalary();
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() < minSalary) {
                minSalary = staff[i].getSalary();
            }
        }
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой:");
                System.out.println(staff[i]);
                System.out.println("---");
            }
        }
    }
    public static void getMaxSalary(Employee[] staff) {
        double maxSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() > maxSalary) {
                maxSalary = staff[i].getSalary();
            }
        }
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой:");
                System.out.println(staff[i]);
                System.out.println("---");
            }
        }
    }
    public static void getAverageSalary(Employee [] staff){
        double totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            totalSalary += staff[i].getSalary();
        }
        double averageSalary = totalSalary / staff.length;
        System.out.println("Средняя зарплата сотрудников равна " + averageSalary + " рублей");
        System.out.println("---");
    }
    public static void getStaffNames(Employee [] staff){
        System.out.println("ФИО сотрудников: ");
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getFullName());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        int count;
        Scanner scan = new Scanner(System.in);
        Employee[] staff = new Employee[10];
        for (int i = 0; i < staff.length; i++) {
            System.out.println("---");
            System.out.println("Введите полное имя сотрудника:");
            String fullName = scan.nextLine();
            System.out.println("Введите номер отдела сотрудника:");
            int departmentNumber = scan.nextInt();
            System.out.println("Введите зарплату сотрудника:");
            double salary = scan.nextDouble();
            staff[i] = new Employee(fullName, departmentNumber, salary);
            scan.nextLine(); //необходимо для считывания ФИО сотрудника, без данной команды "String fullName = scan.nextLine();" пропускается
        }
        System.out.println("---");
        getStaffData(staff);
        getTotalSalary(staff);
        getMinSalary(staff);
        getMaxSalary(staff);
        getAverageSalary(staff);
        getStaffNames(staff);
    }
}
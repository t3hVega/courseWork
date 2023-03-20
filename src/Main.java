import java.util.Scanner;

public class Main {
    public static Employee[] staff = new Employee[10];
    public static void getStaffData(){
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
            System.out.println("---");
        }
    }
    public static double getTotalSalary(){
        double totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            totalSalary += staff[i].getSalary();
        }
        return totalSalary;
    }
    public static void getMinSalary(){
        Employee minSalary = staff[0];
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() < minSalary.getSalary()) {
                minSalary = staff[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(minSalary);
        System.out.println("---");
    }
    public static void getMaxSalary() {
        Employee maxSalary = staff[0];
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = staff[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(maxSalary);
        System.out.println("---");
    }
    public static void getAverageSalary(){
        double averageSalary = getTotalSalary() / staff.length;
        System.out.println("Средняя зарплата сотрудников равна " + averageSalary + " рублей");
        System.out.println("---");
    }
    public static void getStaffNames(){
        System.out.println("ФИО сотрудников: ");
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getFullName());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        int count;
        Scanner scan = new Scanner(System.in);
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
        getStaffData();
        System.out.println("Общая сумма зарплат равна " + getTotalSalary() + " рублей");
        System.out.println("---");
        getMinSalary();
        getMaxSalary();
        getAverageSalary();
        getStaffNames();
    }
}
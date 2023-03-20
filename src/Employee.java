public class Employee {
    private String fullName;
    private int departmentNumber;
    private double salary;
    private int id;
    public static int count;

    public Employee (String fullName, int departmentNumber, double salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = ++count;
    }

    public String getFullName() {
        return fullName;
    }
    public int getDepartmentNumber() {
        return departmentNumber;
    }
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Сотрудник №" + id + "\n" +
                "ФИО - " + fullName + "\n" +
                "Номер отдела - " + departmentNumber + "\n" +
                "Зарплата - " + salary;
    }
}


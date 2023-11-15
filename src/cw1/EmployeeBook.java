package cw1;

public class EmployeeBook {
    static Employee[] emps;
    static int size;

    public EmployeeBook(int size) {
        this.size = size;
        emps = new Employee[size];
    }

    static int dept() {
        return (int) (Math.random() * 5 + 1);
    }

    static int salary() {
        return (int) (Math.random() * 100000 + 50000);
    }

    static String name() {
        String str = "Emp" + (Employee.getCount());
        return str;
    }

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        for (int i = 0; i < 7; i++) {
            EmployeeBookService.addEmployee(name(), dept(), salary());
        }
        EmployeeBookService.printAllEmployees();
        System.out.println("Сумма всех ЗП: " + EmployeeBookService.salarySum());
        System.out.println("Минимальная ЗП: " + EmployeeBookService.minSalary());
        System.out.println("Максимальная ЗП: " + EmployeeBookService.maxSalary());
        System.out.printf("Средняя ЗП: %.2f%n", EmployeeBookService.avgSalary());
        System.out.println("ФИО сотрудников:");
        EmployeeBookService.getEmpNames();
    }

}

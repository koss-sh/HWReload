package cw1;

import java.sql.SQLOutput;

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
        EmployeeBookService.indexSalary(10);
        System.out.println("После индексации:");
        System.out.println("Сумма всех ЗП: " + EmployeeBookService.salarySum());
        System.out.println("Минимальная ЗП: " + EmployeeBookService.minSalary());
        System.out.println("Максимальная ЗП: " + EmployeeBookService.maxSalary());
        System.out.printf("Средняя ЗП: %.2f%n", EmployeeBookService.avgSalary());
        int department = 1;
        System.out.printf("Минимум в отделе №%d у сотрудника: %s%n",
                department, EmployeeBookService.minSalary(department));
        System.out.printf("Максимум в отделе №%d у сотрудника: %s%n",
                department, EmployeeBookService.maxSalary(department));
        System.out.printf("Сумма ЗП по отделу №%d у сотрудника: %s%n",
                department, EmployeeBookService.salarySum(department));
        System.out.printf("Средняя ЗП по отделу №%d: %.2f%n", department, EmployeeBookService.avgSalary(department));
        EmployeeBookService.indexSalary(department,20);
        System.out.printf("После индексации отдела №%d:%n", department);
        System.out.printf("Минимум в отделе №%d у сотрудника: %s%n",
                department, EmployeeBookService.minSalary(department));
        System.out.printf("Максимум в отделе №%d у сотрудника: %s%n",
                department, EmployeeBookService.maxSalary(department));
        System.out.printf("Сумма ЗП по отделу №%d у сотрудника: %s%n",
                department, EmployeeBookService.salarySum(department));
        System.out.printf("Средняя ЗП по отделу №%d: %.2f%n", department, EmployeeBookService.avgSalary(department));
        System.out.printf("ФИО сотрудников отдела №%d:", department);
        EmployeeBookService.getEmpNames(department);
        System.out.println("Все с ЗП меньше 100000: ");
        EmployeeBookService.getSalaryLessThan(100000);
        System.out.println("Все с ЗП больше 100000: ");
        EmployeeBookService.getSalaryMoreThan(100000);
        System.out.println("ФИО сотрудников:");
        //EmployeeBookService.getEmpNames();

    }

}

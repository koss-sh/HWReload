package cw1;

import java.util.Random;

public class Main {
    static Random random = new Random();
    static int dept() {
        return random.nextInt(1,6);
    }
    static int salary() {
        return random.nextInt(50000, 150000);
    }

    public static Employee generate(){
        return new Employee(
                "Emp"+(Employee.getCount()),
                random.nextInt(1,6),
                random.nextInt(50000, 150000)
        );
    }
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

       for (int i = 0; i < 10; i++) {
            employeeBook.addEmployee(generate());
       }
        employeeBook.printAllEmployees();
        employeeBook.deleteEmployee(3);
        employeeBook.deleteEmployee("Emp5");
        employeeBook.editEmployee("Emp1",salary(),dept());
        System.out.println();
        employeeBook.printAllEmployees();
        System.out.println();
        employeeBook.addEmployee(generate());
        employeeBook.printAllEmployees();
        System.out.println("Сумма всех ЗП: " + employeeBook.salarySum());
        System.out.println("Минимальная ЗП: " + employeeBook.minSalary());
        System.out.println("Максимальная ЗП: " + employeeBook.maxSalary());
        System.out.printf("Средняя ЗП: %.2f%n", employeeBook.avgSalary());
        employeeBook.indexSalary(10);
        System.out.println("После индексации:");
        System.out.println("Сумма всех ЗП: " + employeeBook.salarySum());
        System.out.println("Минимальная ЗП: " + employeeBook.minSalary());
        System.out.println("Максимальная ЗП: " + employeeBook.maxSalary());
        System.out.printf("Средняя ЗП: %.2f%n", employeeBook.avgSalary());
        int department = 1;
        System.out.printf("Минимум в отделе №%d у сотрудника: %s%n",
                department, employeeBook.minSalary(department));
        System.out.printf("Максимум в отделе №%d у сотрудника: %s%n",
                department, employeeBook.maxSalary(department));
        System.out.printf("Сумма ЗП по отделу №%d у сотрудника: %s%n",
                department, employeeBook.salarySum(department));
        System.out.printf("Средняя ЗП по отделу №%d: %.2f%n", department, employeeBook.avgSalary(department));
        employeeBook.indexSalary(department,20);
        System.out.printf("После индексации отдела №%d:%n", department);
        System.out.printf("Минимум в отделе №%d у сотрудника: %s%n",
                department, employeeBook.minSalary(department));
        System.out.printf("Максимум в отделе №%d у сотрудника: %s%n",
                department, employeeBook.maxSalary(department));
        System.out.printf("Сумма ЗП по отделу №%d у сотрудника: %s%n",
                department, employeeBook.salarySum(department));
        System.out.printf("Средняя ЗП по отделу №%d: %.2f%n", department, employeeBook.avgSalary(department));
        System.out.printf("ФИО сотрудников отдела №%d:%n", department);
        employeeBook.getEmpNames(department);
        System.out.println("Все с ЗП меньше 100000: ");
        employeeBook.getSalaryLessThan(100000);
        System.out.println("Все с ЗП больше 100000: ");
        employeeBook.getSalaryMoreThan(100000);
        System.out.println("ФИО сотрудников:");
        employeeBook.getEmpNames();
        employeeBook.getEmpNamesByAllDepts();
    }
}

package cw1;

import static cw1.EmployeeBook.dept;
import static cw1.EmployeeBook.emps;

public class EmployeeBookService {
    public static void addEmployee(String name, int department, int salary) {
        if (Employee.getCount() < EmployeeBook.size) {
            Employee emp = new Employee(name, department, salary);
            emps[Employee.getCount() - 1] = emp;
        } else {
            System.out.println("Сотрудника добавить нельзя");
        }
    }

    public static void printAllEmployees() {
        for (Employee e : emps) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static int salarySum() {
        int sum = 0;
        for (Employee e : emps) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee emp = null;
        for (Employee e : emps) {
            if (e != null) {
                if (e.getSalary() < min) {
                    min = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee emp = null;
        for (Employee e : emps) {
            if (e != null) {
                if (e.getSalary() > max) {
                    max = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    public static double avgSalary() {
        return (double) salarySum() / (Employee.getCount() - 1);
    }
    public static void getEmpNames() {
        for (Employee e : emps) {
            if (e != null) {
                System.out.println(e.getName());
            }
        }
    }
}

package cw1;

import javax.swing.*;
import java.io.PrintStream;
import java.sql.SQLOutput;

public class EmployeeBook {
    private Employee[] emps;
    private static final int SIZE = 10;


    public EmployeeBook() {
        emps = new Employee[SIZE];
    }

    void addEmployee(Employee emp) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] == null) {
                emps[i] = emp;
                return;
            }
        }
    }

    void deleteEmployee(int id) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] != null && emps[i].getId() == id) {
                emps[i] = null;
                return;
            }
        }
        System.out.println("Такого сотрудника нет в списке");
    }

    void deleteEmployee(String name) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] != null && emps[i].getName().equals(name)) {
                emps[i] = null;
                return;
            }
        }
        System.out.println("Такого сотрудника нет в списке");
    }

    void editEmployee(String name, int newSalary, int newDepartment) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] != null && emps[i].getName().equals(name)) {
                emps[i].setSalary(newSalary);
                emps[i].setDepartment(newDepartment);
                return;
            }
        }
        System.out.println("Такого сотрудника нет в списке");
    }

    void printAllEmployees() {
        for (Employee e : emps) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    int salarySum() {
        int sum = 0;
        for (Employee e : emps) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    Employee minSalary() {
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

    Employee maxSalary() {
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

    double avgSalary() {
        return (double) salarySum() / (Employee.getCount() - 1);
    }

    void getEmpNames() {
        for (Employee e : emps) {
            if (e != null) {
                System.out.println(e.getName());
            }
        }
    }

    // СРЕДНИЙ УРОВЕНЬ
    void indexSalary(double indexationPercent) {
        double indexationCoeff = 1 + indexationPercent / 100;
        for (Employee e : emps) {
            if (e != null) {
                e.setSalary((int) (e.getSalary() * indexationCoeff));
            }
        }
    }

    Employee minSalary(int department) {
        int min = Integer.MAX_VALUE;
        Employee emp = null;
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                if (e.getSalary() < min) {
                    min = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    Employee maxSalary(int department) {
        int max = Integer.MIN_VALUE;
        Employee emp = null;
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                if (e.getSalary() > max) {
                    max = e.getSalary();
                    emp = e;
                }
            }
        }
        return emp;
    }

    int salarySum(int department) {
        int sum = 0;
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    double avgSalary(int department) {
        int sum = 0;
        int count = 0;
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                count++;
                sum += e.getSalary();
            }
        }
        if (count == 0) return 0;
        return (double) sum / count;
    }

    void indexSalary(int department, double indexationPercent) {
        double indexationCoeff = 1 + indexationPercent / 100;
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                e.setSalary((int) (e.getSalary() * indexationCoeff));
            }
        }
    }

    void getEmpNames(int department) {
        for (Employee e : emps) {
            if (e != null && e.getDepartment() == department) {
                System.out.printf(
                        "ID: %d, ФИО: %s, ЗП: %d%n",
                        e.getId(), e.getName(), e.getSalary()
                );
            }
        }
    }

    void getSalaryLessThan(int salary) {
        for (Employee e : emps) {
            if (e != null && e.getSalary() < salary) {
                System.out.printf(
                        "ID: %d, ФИО: %s, ЗП: %d%n",
                        e.getId(), e.getName(), e.getSalary());
            }
        }
    }

    void getSalaryMoreThan(int salary) {
        for (Employee e : emps) {
            if (e != null && e.getSalary() > salary) {
                System.out.printf(
                        "ID: %d, ФИО: %s, ЗП: %d%n",
                        e.getId(), e.getName(), e.getSalary());
            }
        }
    }

    void getEmpNamesByAllDepts() {
        for (int dept = 1; dept <= 5; dept++) {
            StringBuilder result = new StringBuilder();
            for (Employee e : emps) {
                if (e != null && e.getDepartment() == dept) {
                    result.append(e).append("\n");
                }
            }
            if (!result.isEmpty()) {
                System.out.println("Сотрудники отдела " + dept + ":\n" + result);
            }
        }
    }
}

package hw1_1____1_11;

public class hw1_10 {
    public static void main(String[] args) {

        System.out.println("task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё', 'е'));

    }
}

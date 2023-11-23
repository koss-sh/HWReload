package hw2_1;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    static void changeValue(int value) {
        value = 22;
    }

    static void changeValue(Integer value2) {
        value2 = 22;
    }

    static void changeValue(Integer[] value3) {
        value3 = new Integer[]{1, 2};
    }

    static void changeValue4(Integer[] value4) {
        value4[0] = 99;
    }

    static void changePerson(Person person) {
        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    static void changePerson2(Person person2) {
        person2.name = "Ilya";
        person2.surname = "Lagutenko";
    }

    public static void main(String[] args) {
        System.out.println("task 1");
        int value = 33;
        System.out.println(value);
        changeValue(value);
        System.out.println(value);

        System.out.println("task 2");
        Integer value2 = 33;
        System.out.println(value2);
        changeValue(value2);
        System.out.println(value2);

        System.out.println("task 3");
        Integer[] value3 = {3, 4};
        System.out.println(Arrays.toString(value3));
        changeValue(value3);
        System.out.println(Arrays.toString(value3));

        System.out.println("task 4");
        Integer[] value4 = {3, 4};
        System.out.println(Arrays.toString(value4));
        changeValue4(value4);
        System.out.println(Arrays.toString(value4));

        System.out.println("task 5");
        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        System.out.println(person);
        changePerson(person);
        System.out.println(person);

        System.out.println("task 6");
        Person person2 = new Person();
        person2.name = "Lyapis";
        person2.surname = "Trubetskoy";
        System.out.println(person2);
        changePerson2(person2);
        System.out.println(person2);
    }
    public static class Person{
        String name;
        String surname;

        @Override
        public String toString() {
            return name +
                    " " + surname;
        }
    }
}

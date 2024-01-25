import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person employee1 = new Employee("Olzhas", "Bratan", "Businessman", 9999999);
        Person employee2 = new Employee("Mendik", "Alan", "Manager", 4200);
        Person employee3 = new Employee("Nuris", "Ulan", "Chemist", 1150000);
        Person employee4 = new Employee("Almansur", "Elan", "Pirate", 163450);
        Person employee5 = new Employee("Raha", "Ilan", "Astronaut", 360500);

        Person student1 = new Student("Askar", "Wlan", 2.23);
        Person student2 = new Student("Nurislam", "Qlan", 2.76);
        Person student3 = new Student("Danial", "Slan", 2.92);
        Person student4 = new Student("Doni", "Plan", 3.02);
        Person student5 = new Student("Aidar", "Clan", 3.03);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(employee1);
        persons.add(employee2);
        persons.add(employee3);
        persons.add(employee4);
        persons.add(employee5);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(student5);

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}
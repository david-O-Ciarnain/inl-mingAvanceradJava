package se.labb.uppgift1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static se.labb.uppgift1.Gender.*;

public class One {
    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Sven", MALE,26550),
                new Person("Orvar", MALE,34450),
                new Person("Katrin", FEMALE,46850),
                new Person("Agnes", FEMALE,16590),
                new Person("Oskar", MALE,22150),
                new Person("Fanny", FEMALE,26590),
                new Person("Sara", FEMALE,44250),
                new Person("Astrid", FEMALE,28450),
                new Person("Janne", MALE,66150),
                new Person("Kurt", MALE,26250)
        );

        Map<Gender,Double>averageSalary = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,Collectors.averagingDouble(Person::getSalary)));
        System.out.println(averageSalary);





                personList.stream()
                        .max(Comparator.comparing(Person::getSalary))
                        .ifPresent(x -> System.out.println("highest salary " + x.getName()  +", salary: " + x.getSalary()));

                personList.stream()
                        .min(Comparator.comparing(Person::getSalary))
                        .ifPresent(x -> System.out.println("lowest salary " + x.getName()  +" , salary:  " + x.getSalary()));


    }
}

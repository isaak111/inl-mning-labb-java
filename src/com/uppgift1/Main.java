package com.uppgift1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Adde", 32000, Gender.MALE),
                new Person("Olle", 24000, Gender.MALE),
                new Person("Monica", 50000, Gender.FEMALE),
                new Person("Christian", 46000, Gender.MALE),
                new Person("Lovisa", 22000, Gender.FEMALE),
                new Person("Johanna", 36000, Gender.FEMALE),
                new Person("Jon", 12000, Gender.MALE),
                new Person("Kingsley", 122000, Gender.MALE),
                new Person("Mariette", 29000, Gender.FEMALE),
                new Person("Annika", 47000, Gender.FEMALE)
        );

        // 1.1 genomsnitt kvinnor

        System.out.println(
        persons
                .stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.averagingDouble(Person::getSalary))
        );
        //genomsnitt män
        System.out.println(
                persons
                        .stream()
                        .filter(person -> person.getGender().equals(Gender.MALE))
                        .collect(Collectors.averagingDouble(Person::getSalary))
        );

        //1.2 högst lön
        System.out.println(
        persons
                .stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(1)
                .toList()
        );
        //1.3 lägst lön
        System.out.println(
                persons
                        .stream()
                        .sorted(Comparator.comparing(Person::getSalary))
                        .limit(1)
                        .toList()
        );

    }
}

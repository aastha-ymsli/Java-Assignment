package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class FilterPeople {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 27)
        );

        List<Person> filtered = people.stream()
                                      .filter(p -> p.getAge() > 25)
                                      .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}


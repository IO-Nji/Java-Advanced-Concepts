package functionalProgDemo;

import java.util.ArrayList;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John Doe", Gender.MALE),
                new Person("Jane Doe", Gender.FEMALE),
                new Person("David Duran", Gender.MALE),
                new Person("Ernie Richton", Gender.MALE),
                new Person("Susan Twoshoes", Gender.FEMALE),
                new Person("Eric Misterer", Gender.MALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender() == Gender.FEMALE) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person.getName());
        }

//                people.stream().filter(p -> p.gender == Gender.FEMALE).collect(Collectors.toList()); // <1>
    }
}
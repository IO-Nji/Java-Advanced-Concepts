package functionalDemo;

import java.util.List;

public class Declarative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John Doe", Gender.MALE),
                new Person("Jane Doe", Gender.FEMALE),
                new Person("David Duran", Gender.MALE),
                new Person("Ernie Richton", Gender.MALE),
                new Person("Susan Twoshoes", Gender.FEMALE),
                new Person("Eric Misterer", Gender.MALE)
        );

//        Get and Print all females
        people.stream()
                .filter(p -> p.getGender() == Gender.FEMALE)
                .forEach(System.out::println);

    }


}

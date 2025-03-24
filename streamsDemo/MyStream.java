package streamsDemo;

import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John Doe", Gender.MALE),
                new Person("Jane Doe", Gender.FEMALE),
                new Person("David Duran", Gender.MALE),
                new Person("Ernie Richton", Gender.MALE),
                new Person("Susan Twoshoes", Gender.FEMALE),
                new Person("Eric Misterer", Gender.MALE),
                new Person("James Rwanda", Gender.MALE),
                new Person("Emily Winebar", Gender.FEMALE),
                new Person("Petra Fired", Gender.FEMALE),
                new Person("Neba Zeuss", Gender.MALE),
                new Person("Julia Cometo", Gender.FEMALE),
                new Person("Georgia Tekilla", Gender.FEMALE)
        );

        people.stream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach((gender, peopleByGender) -> System.out.println(gender + ": " + peopleByGender)); // <1>

    }
}

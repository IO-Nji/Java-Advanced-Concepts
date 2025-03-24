package streamsDemo;


class Person {
    private final String name;
    private final Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender.toString();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}'; //"name;
    }
}
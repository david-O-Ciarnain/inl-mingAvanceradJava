package se.labb.uppgift1;

public record Person(String name, Gender gender, double salary) {

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}

enum Gender {
    FEMALE, MALE, PREFER_NOT_TO_SAY
}

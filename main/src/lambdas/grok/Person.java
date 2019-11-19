package lambdas.grok;

import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE, TRANS, INTERSEX
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return this.birthday.until(LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static void printPersons(List<Person> roster) {

        roster.forEach(p -> {
            if (p.getAge() > 60) {
                p.printPerson();
            }
        });
    }
}
package controller;

import dto.Person;
import java.util.List;
import java.util.stream.Collectors;

public class PersonController {
    private List<Person> personList;

    public PersonController(List<Person> personList) {
        this.personList = personList;
    }

    public void executeProof(){
        System.out.println(this.executeOver21().toString());
        System.out.println(this.executeUnder18().toString());
        System.out.println(this.executeOver21WithSSN().toString());
    }

    private List<Person> executeOver21() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .collect(Collectors.toList());
    }

    private List<Person> executeUnder18() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() < 21)
                .collect(Collectors.toList());
    }

    private List<Person> executeOver21WithSSN() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .filter(Person -> Person.getSsn() > 20000000)
                .collect(Collectors.toList());
    }

}

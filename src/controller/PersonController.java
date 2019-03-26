package controller;

import dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonController {
    private List<Person> personList;

    public PersonController() {
        this.personList = new ArrayList<Person>();
        init();
    }

    public void init() {
        Person person1 = new Person("Federico", "Gallo", 24, 38056968);
        Person person2 = new Person("Anibal", "Matellan", 20, 42231645);
        Person person3 = new Person("Guillermo", "Fernandez", 40, 12635172);
        Person person4 = new Person("Carlos", "Martinez", 15, 46283790);
        Person person5 = new Person("Fernando", "Suarez", 59, 6052168);
        addPerson(person1, person2, person3, person4, person5);
    }

    public List<Person> executeOver21() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .collect(Collectors.toList());
    }

    public List<Person> executeUnder18() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() < 21)
                .collect(Collectors.toList());
    }

    public List<Person> executeOver21WithSSN() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .filter(Person -> Person.getSsn() > 20000000)
                .collect(Collectors.toList());
    }


    private void addPerson(Person... person) {
        for (Person personLocal : person) {
            this.personList.add(personLocal);
        }
    }

}

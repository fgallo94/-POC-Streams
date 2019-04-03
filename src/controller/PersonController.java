package controller;

import dto.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Person controller for POC
 *
 * @author fgallo94
 */
public class PersonController {
    /**
     * Local List used by .stream()
     */
    private List<Person> personList;

    /**
     * Constuctor by default
     *
     * @param personList list to replace local list
     */
    public PersonController(List<Person> personList) {
        this.personList = personList;
    }

    /**
     * Proof what show only results on screen
     */
    public void executeProof() {
        System.out.println("executeOver21()\n" + this.executeOver21().toString());
        System.out.println("executeUnder18()\n" + this.executeUnder18().toString());
        System.out.println("executeOver21WithSSN()\n" + this.executeOver21WithSSN().toString());
        System.out.println("showNameOfOnlyOver21()\n" + this.showNamesofOnly2Over21().toString());
    }

    /**
     * Take the local list and filter by age over 21
     *
     * @return List<Person>:
     * list filtered by age
     */
    private List<Person> executeOver21() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .collect(Collectors.toList());
    }

    /**
     * Take the local list and filter by age under 18
     *
     * @return List<Person>:
     * list filtered by age
     */
    private List<Person> executeUnder18() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() < 18)
                .collect(Collectors.toList());
    }

    /**
     * Take the local list and filter by age over 21 and ssn > 20.000.000
     *
     * @return List<Person>:
     * list filtered by age
     */
    private List<Person> executeOver21WithSSN() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .filter(Person -> Person.getSsn() > 20000000)
                .collect(Collectors.toList());
    }

    /**
     * Take the local list, filter by age over 21, map only the firstName, sorted reversed alphabetical, limit the result to 2 and collect into a list
     *
     * @return List<String> of firstName of people under 21
     */
    private List<String> showNamesofOnly2Over21() {
        return this.personList.stream()
                .filter(Person -> Person.getAge() > 21)
                .sorted(Comparator.reverseOrder())
                .map(Person::getFirstName)
                .limit(2)
                .collect(Collectors.toList());
    }

}

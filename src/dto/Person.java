package dto;

/**
 * Main DTO for POC
 *
 * @author fgallo94
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long ssn;

    /**
     * Contructor with parameters by default
     */
    public Person(String firstName, String lastName, int age, long ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    /**
     * Override of .toString() who can show all properties of the class
     *
     * @return String with all properties.
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }

    public int getAge() {
        return age;
    }

    public long getSsn() {
        return ssn;
    }
}

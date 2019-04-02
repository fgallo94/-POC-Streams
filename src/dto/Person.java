package dto;

/**
 * Main DTO for POC of Streams and Builder Pattern
 *
 * @author fgallo94
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long ssn;

    /**
     * Private constructor for builder pattern
     */
    private Person() {
    }

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
                "}\n";
    }

    public int getAge() {
        return age;
    }

    public long getSsn() {
        return ssn;
    }

    /**
     * POC for Builder Pattern
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private long ssn;

        /**
         * Constructor by default
         */
        public Builder() {
        }

        /**
         * We need to create a private constructor by default and asign the properties of this builder to person properties
         * Called at last of the fluent interface
         *
         * @return new Person
         */
        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.age = this.age;
            person.ssn = this.ssn;
            return person;
        }

        /**
         * Setters of builder, methods return Builder to make a fluent interface
         *
         * @return methods return 'this'
         */
        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder hisAge(int age) {
            this.age = age;
            return this;
        }

        public Builder andSocialSecurityNumber(long ssn) {
            this.ssn = ssn;
            return this;
        }
    }
}

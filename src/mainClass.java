import controller.PersonController;
import dto.Person;

import java.util.List;
import java.util.Arrays;

/**
 * First Proof of Concept of Stream by jdk 1.8
 *
 * @author fgallo94
 */
public class mainClass {

    /**
     * Initialize and fill a new List<Person> for the PersonController then call to executeProof().
     * Added Builder Pattern POC to Person
     */
    public static void main(String[] args) {

        Person person1 = new Person.Builder()
                .withFirstName("Federico")
                .withLastName("Gallo")
                .hisAge(24)
                .andSocialSecurityNumber(38056968)
                .build();
        List<Person> personList = Arrays.asList(person1,
                new Person("Anibal", "Matellan", 20, 42231645),
                new Person("Guillermo", "Fernandez", 40, 12635172),
                new Person("Carlos", "Martinez", 15, 46283790),
                new Person("Facundo", "Vega", 29, 6052168));
        PersonController personController = new PersonController(personList);
        personController.executeProof();
    }
}

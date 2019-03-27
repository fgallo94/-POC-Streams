import controller.PersonController;
import dto.Person;

import java.util.List;
import java.util.Arrays;;

/**
 * First Proof of Concept of Stream by jdk 1.8
 *
 * @author fgallo94
 */
public class main {

    /**
     * Initialize and fill a new List<Person> for the PersonController then call to executeProof().
     */
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Federico", "Gallo", 24, 38056968),
                new Person("Anibal", "Matellan", 20, 42231645),
                new Person("Guillermo", "Fernandez", 40, 12635172),
                new Person("Carlos", "Martinez", 15, 46283790),
                new Person("Fernando", "Suarez", 59, 6052168));
        PersonController personController = new PersonController(personList);
        personController.executeProof();
    }
}

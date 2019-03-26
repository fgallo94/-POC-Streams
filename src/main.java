import controller.PersonController;

public class main {

    public static void main(String[] args) {
        PersonController personController = new PersonController();
        System.out.println(personController.executeOver21().toString());
        System.out.println(personController.executeUnder18().toString());
        System.out.println(personController.executeOver21WithSSN().toString());
    }
}

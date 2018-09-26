import controller.PersonCompare;
import controller.PersonController;
import model.Person;
import view.PersonView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<Person>();


        person.add(new Person("Asia", 20));
        person.add(new Person("Asia", 15));
        person.add(new Person("Maciek", 18));
        person.add(new Person("Jacek", 22));
        person.add(new Person("Artur", 16));
        person.add(new Person("Maciek", 22));
        person.add(new Person("Asia", 24));

        PersonController personController = new PersonController();
        List<Person> records = personController.transform(person);

        PersonCompare comparator = new PersonCompare();
        Collections.sort(records, comparator);

        PersonView personView = new PersonView();
        personView.displayPersons(records);
    }
}

package controller;

import model.Person;
import org.junit.jupiter.api.Test;
import view.PersonView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonControllerTest {

    private List<Person> person = new ArrayList<Person>();
    private List<Person> result = new ArrayList<Person>();

    private void setUp(){

        person.add(new Person("Asia", 20));
        person.add(new Person("Asia", 15));

        result.add(new Person("Asia", 35));
    }


    @Test
    public void test1(){
        PersonView personView = new PersonView();
        setUp();
        PersonController personController = new PersonController();
        List<Person> method = personController.transform(person);
        assertEquals(personView.displayPersons(result), personView.displayPersons(method));
    }

}
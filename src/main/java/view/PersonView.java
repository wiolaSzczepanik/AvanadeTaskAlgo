package view;

import model.Person;

import java.util.List;

public class PersonView {

    public void displayPersons(List<Person> persons){
        for(Person p: persons) {
            System.out.println(p.name + " " + p.age);
//            return p.name + " " + p.age;
        }
//        return "";
    }
}

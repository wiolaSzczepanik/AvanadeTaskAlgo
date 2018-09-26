package controller;

import model.Person;

import java.util.*;

public class PersonController {

    public List<Person> transform(List<Person> input) {
        List<Person> records = new ArrayList<>();

        sortCollection(input);


        Person personToCheck = new Person();

        for(Person p: input){
            if(p.getName().equals(personToCheck.name)){
                personToCheck.calculateAge(p.getAge());
            }else{
                Person copy = p.getCopy();
                records.add(copy);
                personToCheck = copy;
            }
        }

        return records;
    }

    public void sortCollection(List<Person> collection){
        PersonCompare comparator = new PersonCompare();
        Collections.sort(collection, comparator);

    }
}
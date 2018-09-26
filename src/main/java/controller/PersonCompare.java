package controller;

import model.Person;

import java.util.Comparator;

public class PersonCompare implements Comparator<Person>{

    public int compare(Person obj, Person obj2) {
            return obj.getName().compareTo(obj2.getName());
        }
    }


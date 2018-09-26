package controller;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonController {

    public List<Person> transform(List<Person> input){
        List<Person> records = new ArrayList<Person>();
        int age=0;

        for(int i=0; i<input.size(); i++){
            for(int j=1; j<input.size()-i; j++){
                if(input.get(j).name ==(input.get(i).name)){
                  age = age + input.get(i).age + input.get(j).age;
                  Person newPerson = new Person(input.get(i).name, age);
                  records.add(newPerson);
                }
            }
        }
        return records;
    }
}

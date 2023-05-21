package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Student {
    String name;
    int age;
    LinkedList<String> itemList= new LinkedList<String>();
    public Student(String name1, int age1){
        name=name1;
        age=age1;
    }
    public void addThing(String newItem){
        itemList.add(newItem);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public List<String> getItems(){
        return itemList;
    }
}

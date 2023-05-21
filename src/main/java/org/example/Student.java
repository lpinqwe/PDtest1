package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    List<String> itemList= new ArrayList<>();
    public Student(String name1, int age1) throws Exception {
        if(name1 =="" || age1>120 || age1<5){
            throw new Exception("wrong Data name != '', age<120, age >5");
        }
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
    public List<String> getItems() {
        return List.of(itemList.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", itemList=" + itemList +
                '}';
    }
}

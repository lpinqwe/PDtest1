package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student("NAME_1",9999);
        student.addThing("math");
        student.addThing("physics");
        student.addThing("hitory");
        System.out.println("CALL_1: "+student.getName()+"\n"+student.getAge()+"\n" +student.getItems());
        student.addThing("EN");
        System.out.println("CALL_2: "+student.getItems());

    }
}
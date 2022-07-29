package quru.qa;

import org.w3c.dom.ls.LSOutput;

public class Person {
    int age;
    String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void goToPension() {
        if (age > 65) {
            System.out.println("Я на пенсиии :(");
        } else {
            System.out.println("Я еще молод!");
        }
    }
    void sayName() {
        System.out.println("Моё имя: " + age);
    }


}

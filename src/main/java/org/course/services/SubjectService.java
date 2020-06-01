package org.course.services;

import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    public String getContent(String chapterName, String subjectName) {
      return dummyContent();
    }

    private String dummyContent(){
        return "Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type. In short constructor and method are different(More on this at the end of this guide). People often refer constructor as special type of method in Java. Constructor has same name as the class and looks like this in a java code.\n" +
                "public class MyClass{\n" +
                "           //this is the constructor\n" +
                "\tMyClass(){\n" +
                "\t}\n" +
                "\t..\n" +
                "}\n" +
                "To understand the working of constructor, lets take an example. lets say we have a class MyClass.\n" +
                "When we create the object of MyClass like this:\n" +
                "MyClass obj = new MyClass();\n" +
                "The new keyword here creates the object of class MyClass and invokes the constructor to initialize this newly created object.\n";
    }

}

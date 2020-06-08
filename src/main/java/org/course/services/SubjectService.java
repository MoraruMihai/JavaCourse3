package org.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:subject.properties")
public class SubjectService {

    @Autowired
    private Environment environment;

    public String getSubjectDefinition(String subjectName){
        String propertyKey = "subject.definition." + subjectName.replace(" ", ".").toLowerCase();

        if(environment.containsProperty(propertyKey)){
            return environment.getProperty(propertyKey);
        }else{
            return "No such subject found!";
        }
    }
    public String getSubjectInfo(String subjectName){
        String propertyKey = "subject.information." + subjectName.replace(" ", ".").toLowerCase();
        if(environment.containsProperty(propertyKey)){
            return environment.getProperty(propertyKey);
        }else{
            return "No such subject found!";
        }

    }
    public String getSubjectExample(String subjectName){
        String propertyKey = "subject.example." + subjectName.replace(" ", ".").toLowerCase();
        if(environment.containsProperty(propertyKey)){
            return environment.getProperty(propertyKey);
        }else{
            return "No such subject found!";
        }

    }

}

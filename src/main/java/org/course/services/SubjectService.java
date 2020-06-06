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

    public String getSubjectContent(String chapterName, String subjectName){
        String propertyKey = "subject." + subjectName.replace(" ", ".").toLowerCase();
        if(environment.containsProperty(propertyKey)){
            return environment.getProperty(propertyKey);
        }else{
            return "No such subject found!";
        }
    }

}

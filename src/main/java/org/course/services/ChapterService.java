package org.course.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChapterService {

    private static Map<String, List<String>> allSubjects;

    public List<String> getSubjects(String chapterName) {
        if(allSubjects == null){
            initAllSubjects();
        }
        return allSubjects.get(chapterName);
    }

    private void initAllSubjects() {
        allSubjects = new HashMap<>();

        List<String> basicChapterSubjects = new ArrayList<>();
        basicChapterSubjects.add("Expressions");
        basicChapterSubjects.add("Variables");
        basicChapterSubjects.add("Primitives");
        basicChapterSubjects.add("Casting");
        basicChapterSubjects.add("Logical Operators");
        basicChapterSubjects.add("Ternary Operator");
        basicChapterSubjects.add("Keywords");
        basicChapterSubjects.add("Statements, whitespace & Indentation");
        basicChapterSubjects.add("Code Blocks");
        basicChapterSubjects.add("Methods");
        basicChapterSubjects.add("Control Flow Statements");

        List<String> intermediateChapterSubjects = new ArrayList<>();
        intermediateChapterSubjects.add("Classes");
        intermediateChapterSubjects.add("Constructors");
        intermediateChapterSubjects.add("this vs super");
        intermediateChapterSubjects.add("Inheritance");
        intermediateChapterSubjects.add("Method Overloading");
        intermediateChapterSubjects.add("Method Overriding ");
        intermediateChapterSubjects.add("Static vs Instance Variables and Methods");
        intermediateChapterSubjects.add("Encapsulation");
        intermediateChapterSubjects.add("Polymorphism");
        intermediateChapterSubjects.add("Autoboxing and unboxing");

        List<String> advancedChapterSubjects = new ArrayList<>();
        advancedChapterSubjects.add("Collections");
        advancedChapterSubjects.add("Generics");
        advancedChapterSubjects.add("Java FX");
        advancedChapterSubjects.add("Concurrency");
        advancedChapterSubjects.add("Lambda Expressions");

        allSubjects.put("basic", basicChapterSubjects);
        allSubjects.put("intermediate", intermediateChapterSubjects);
        allSubjects.put("advanced", advancedChapterSubjects);

    }
}

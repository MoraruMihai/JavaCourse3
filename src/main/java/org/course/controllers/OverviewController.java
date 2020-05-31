package org.course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OverviewController {

    private Map<String, List<String>> allSubjects;

    @GetMapping("/overview")
    public ModelAndView overview(){
        return new ModelAndView("overview");
    }

    @GetMapping("/chapter/{chapterName}")
    public ModelAndView genericChapter(@PathVariable String chapterName){
         Map<String, Object> model = new HashMap<>();
         model.put("chapterName" , chapterName);
         model.put("subjects", getSubjects(chapterName));
        return new ModelAndView("generic_chapter", model);
    }

    private List<String> getSubjects(String chapterName) {
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
        intermediateChapterSubjects.add("Constructors");
        intermediateChapterSubjects.add("this vs super");
        intermediateChapterSubjects.add("Inheritance");
        intermediateChapterSubjects.add("Method Overloading");
        intermediateChapterSubjects.add("Method Overriding ");
        intermediateChapterSubjects.add("Static vs Instance Variables/Methods");
        intermediateChapterSubjects.add("Encapsulation");
        intermediateChapterSubjects.add("Polymorphism");
        intermediateChapterSubjects.add("Autoboxing/unboxing");

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

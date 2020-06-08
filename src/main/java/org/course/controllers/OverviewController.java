package org.course.controllers;

import org.course.services.ChapterService;
import org.course.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OverviewController {

    @Autowired
   private ChapterService chapterService;

    @Autowired
    private SubjectService subjectService;


    @GetMapping("/overview")
    public ModelAndView overview(){
        return new ModelAndView("overview");
    }

    @GetMapping("/chapter/{chapterName}")
    public ModelAndView genericChapter(@PathVariable String chapterName){
         Map<String, Object> model = new HashMap<>();

         model.put("chapterName" , chapterName);
         model.put("subjects", chapterService.getSubjects(chapterName));
        return new ModelAndView("generic_chapter", model);
    }

    @GetMapping("/chapter/{chapterName}/subject/{subjectName}")
    public ModelAndView genericSubject(@PathVariable String chapterName, @PathVariable String subjectName){
        Map<String, Object> model = new HashMap<>();
        model.put("chapterName" , chapterName);
        model.put("subjectName" , subjectName);
        model.put("definition", subjectService.getSubjectDefinition(subjectName));
        model.put("information", subjectService.getSubjectInfo(subjectName));
        model.put("example", subjectService.getSubjectExample(subjectName));

        return new ModelAndView("generic_subject", model);
    }

}

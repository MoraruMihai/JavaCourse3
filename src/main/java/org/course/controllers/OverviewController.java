package org.course.controllers;

import org.course.services.ChapterService;
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

}

package org.course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OverviewController {

    private final String OVERVIEW_FILE = "overview.html";
//    private final String CHAPTER_FILE = "chapter.html";
    private final String BASICS_CHAPTER_FILE = "basics_chapter.html";
    private final String INTERMEDIATE_CHAPTER_FILE = "intermediate_chapter.html";
    private final String ADVANCED_CHAPTER_FILE = "advanced_chapter.html";

    @GetMapping("/overview")
    public String overview(){
        return OVERVIEW_FILE;
    }


    @GetMapping("/basics")
    public String basicsChapter(Model model){
        return BASICS_CHAPTER_FILE;
    }

    @GetMapping("/intermediate")
    public String intermediateChapter(Model model){
        return INTERMEDIATE_CHAPTER_FILE;
    }

    @GetMapping("/advanced")
    public String advancedChapter(Model model){
        return ADVANCED_CHAPTER_FILE;
    }

}

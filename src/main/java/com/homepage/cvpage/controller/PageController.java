package com.homepage.cvpage.controller;

import com.homepage.cvpage.interfaces.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/page")
public class PageController {

        private final PageService pageService;

        public PageController(PageService pageService) {
            this.pageService = pageService;
        }


        @RequestMapping(value="/viewPages", method=RequestMethod.GET)
        public String viewPages(Model model) {
            model.addAttribute("pages", pageService.getPages());
            return "introduction";
        }
}

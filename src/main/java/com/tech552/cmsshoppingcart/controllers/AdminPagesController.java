package com.tech552.cmsshoppingcart.controllers;

import com.tech552.cmsshoppingcart.models.Page;
import com.tech552.cmsshoppingcart.repositories.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin/pages")
public class AdminPagesController {

    private PageRepository pageRepository;

    public AdminPagesController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }


    @GetMapping
    public String index(Model model){
        List<Page>pages = pageRepository.findAll();
        model.addAttribute("pages", pages); //Pass pages to a view with a model
        return "admin/pages/index";
    }


    @GetMapping("/add")
    public String add(@ModelAttribute  Page page){
       // model.addAttribute("page", new Page());   // same as = @ModelAttribute  Page page
        return "admin/pages/add";
    }
}

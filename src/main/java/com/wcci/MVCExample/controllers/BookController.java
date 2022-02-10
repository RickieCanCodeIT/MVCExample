package com.wcci.MVCExample.controllers;

import com.wcci.MVCExample.repos.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/")
    public String showBookTemplate(Model model) {
        model.addAttribute("maus", bookRepo.findById(0l).get());
        return "BookTemplate";
    }


}

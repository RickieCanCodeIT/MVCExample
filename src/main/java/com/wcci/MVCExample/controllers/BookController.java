package com.wcci.MVCExample.controllers;

import com.wcci.MVCExample.repos.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/")
    public String showBooksTemplate(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "BooksTemplate";
    }


    @RequestMapping("/books/{id}")
    public String showBookTemplate(Model model, @PathVariable long id) {
        model.addAttribute("inBook", bookRepo.findById(id).get());
        return "BookTemplate";
    }


}

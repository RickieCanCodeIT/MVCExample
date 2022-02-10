package com.wcci.MVCExample.Controllers;

import com.wcci.MVCExample.Book;
import com.wcci.MVCExample.Repos.BookRepository;
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
        model.addAttribute("maus", bookRepo.findById(1l).get());
        return "BookTemplate";
    }


}

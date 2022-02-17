package com.wcci.MVCExample.controllers;

import com.wcci.MVCExample.entities.Book;
import com.wcci.MVCExample.repos.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BookController {
    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/")
    public String showBooksTemplate(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        model.addAttribute("student","Avery");
        return "BooksTemplate";
    }

    @GetMapping("/books/{id}")
    public String showBookTemplate(Model model, @PathVariable long id) {
        Optional<Book> tempBook = bookRepo.findById(id);
        if (tempBook.isPresent())
        {
            model.addAttribute("inBook", tempBook.get());
        }
        return "BookTemplate";
    }
    @PostMapping("/books/{id}")
    public String addReview(@PathVariable long id, @RequestParam String review){
        Book mybook = bookRepo.findById(id).get();
        mybook.addReview(review);
        bookRepo.save(mybook);
        return "redirect:/books/"+ id;
    }

    @RequestMapping("/books/title/{title}")
    public String showBookByTitle(Model model, @PathVariable String title) {
        Optional<Book> tempBook = bookRepo.findByTitleIgnoreCase(title);
        if (tempBook.isPresent())
        {
            model.addAttribute("inBook", tempBook.get());
        }
        return "BookTemplate";
    }


}

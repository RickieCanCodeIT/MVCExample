package com.wcci.MVCExample.controllers;

import com.wcci.MVCExample.entities.Author;
import com.wcci.MVCExample.repos.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class AuthorController {
    private AuthorRepository authorRepo;

    public AuthorController(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/authors/{id}")
    public String showAuthorPage(Model model, @PathVariable Long id) {
        Optional<Author> tempAuthor = authorRepo.findById(id);
        if (tempAuthor.isPresent())
        {
            model.addAttribute("inAuthor", tempAuthor.get());
        }


        return "AuthorTemplate";
    }
}

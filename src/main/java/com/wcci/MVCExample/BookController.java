package com.wcci.MVCExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private Book book = new Book("Maus", "Somebody", "12345654321", "The holocaust with mice and cats");
    @RequestMapping("/")
    public String showBookTemplate(Model model) {
        model.addAttribute("maus", book);
        return "BookTemplate";
    }


}

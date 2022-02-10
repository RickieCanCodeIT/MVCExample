package com.wcci.MVCExample;

import com.wcci.MVCExample.Repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    BookRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Maus", "Somebody", "12345654321", "The holocaust with mice and cats");
        bookRepo.save(book);
        bookRepo.save(new Book("Banned book 2", "Somebody", "12345654321", "description here"));

    }
}

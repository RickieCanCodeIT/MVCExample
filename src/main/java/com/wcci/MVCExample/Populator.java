package com.wcci.MVCExample;

import com.wcci.MVCExample.entities.Author;
import com.wcci.MVCExample.entities.Book;
import com.wcci.MVCExample.repos.AuthorRepository;
import com.wcci.MVCExample.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    BookRepository bookRepo;
    @Autowired
    AuthorRepository authorRepo;

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Maus", "12345654321", "The holocaust with mice and cats");
        bookRepo.save(book);
        Book book2 = new Book("Banned book 2", "12345654321", "description here");
        bookRepo.save(book2);
        Book book3 = new Book("The Catcher in the Rye", "9876543210", "It's an old book");
        bookRepo.save(book3);

        Author author1 = new Author("Art Spiegelmann", "Randomhouse", book);
        Author author2 = new Author("George R.R. Martin", "His publisher", book2);
        Author author3 = new Author("J.R.R. Tolkien", "People with a lot of money", book2);
        Author author4 = new Author("JD Salinger", "An old publisher", book3);

        authorRepo.save(author1);
        authorRepo.save(author2);
        authorRepo.save(author3);
        authorRepo.save(author4);

    }
}

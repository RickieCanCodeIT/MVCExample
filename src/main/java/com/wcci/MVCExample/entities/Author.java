package com.wcci.MVCExample.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String publisher;

//    @ManyToOne
//    private Book book;

    @ManyToMany
    private Collection<Book> books;

    public Author() {

    }

    public Author(String name, String publisher, Book...books) {
        this.name = name;
        this.publisher = publisher;
        this.books = Arrays.asList(books);
        //this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public Collection<Book> getBooks() {
        return books;
    }
}

package com.wcci.MVCExample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String publisher;

    @ManyToOne
    private Book book;

    public Author() {

    }

    public Author(String name, String publisher, Book book) {
        this.name = name;
        this.publisher = publisher;
        this.book = book;
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

    public Book getBook() {
        return book;
    }
}

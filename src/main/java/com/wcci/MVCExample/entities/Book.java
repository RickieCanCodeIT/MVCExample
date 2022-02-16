package com.wcci.MVCExample.entities;

import org.hibernate.tuple.entity.EntityMetamodel;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String isbn;
    private String description;

//    @OneToMany(mappedBy = "book")
//    private Collection<Author> authors;

    @ManyToMany(mappedBy = "books")
    private Collection<Author> authors;

    public Book(String title, String isbn, String description) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
    }

    private Book() {
    }

    public String getTitle() {
        return title;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public Collection<Author> getAuthors() {
        return authors;
    }
}

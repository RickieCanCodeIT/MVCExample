package com.wcci.MVCExample.repos;

import com.wcci.MVCExample.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,Long> {
    Optional<Book> findByTitleIgnoreCase(String title);
    Optional<Book> findByIsbn(String isbn);
}

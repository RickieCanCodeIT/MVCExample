package com.wcci.MVCExample.Repos;

import com.wcci.MVCExample.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
package com.wcci.MVCExample.repos;

import com.wcci.MVCExample.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

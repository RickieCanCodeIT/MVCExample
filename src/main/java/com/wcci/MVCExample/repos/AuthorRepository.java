package com.wcci.MVCExample.repos;

import com.wcci.MVCExample.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

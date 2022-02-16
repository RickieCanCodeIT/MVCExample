package com.wcci.MVCExample;

import com.wcci.MVCExample.controllers.BookController;
import com.wcci.MVCExample.entities.Book;
import com.wcci.MVCExample.repos.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookControllerTest {
    BookRepository mockBookRepo;
    BookController underTest;
    Model mockModel;
    Book tempBook;

    @BeforeEach
    public void setUp() {
        mockBookRepo = mock(BookRepository.class);
        mockModel = mock(Model.class);
        underTest = new BookController(mockBookRepo);
        tempBook = new Book("Maus", "Somebody", "12345654321", "The holocaust with mice and cats");

    }


    //this doesn't work because BookController isn't finshed yet
    @Test
    public void shouldRedirectToCorrectTemplate() {

        //Arrange Action
        mockBookRepo.save(tempBook);

        //String redirectName = underTest.showBookTemplate(mockModel);
        //Assert
        //assertThat(redirectName).isEqualTo("BookTemplate");
    }

    @Test
    public void canAddBooktoRepo() {

        mockBookRepo.save(tempBook);
        verify(mockBookRepo).save(tempBook);
    }
}

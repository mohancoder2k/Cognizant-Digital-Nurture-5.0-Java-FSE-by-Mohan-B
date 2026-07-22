package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

    private BookRepository repository;

    public void setBookRepository(
            BookRepository repository) {

        this.repository = repository;
    }

    public void displayService() {

        System.out.println(
                "Book Service Using Repository");

        repository.displayRepository();
    }
    public void addBook() {

        System.out.println("Book Added Successfully");
    }
}
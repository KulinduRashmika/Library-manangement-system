package com.book.demo.service;

import com.book.demo.data.Book;
import com.book.demo.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public Book creatBook(Book book){
        return  bookRepo.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> searchBook(String name){
        return bookRepo.findByBname(name);
    }

    public List<Book> searchABook(String aname){
        return bookRepo.findByAname(aname);
    }

    public List<Book> searchCategory(String category){
        return bookRepo.findByCategory(category);
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(Math.toIntExact(id));
    }



}
package com.book.demo.controller;

import com.book.demo.data.Book;
import com.book.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.creatBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")  // ✅ <--- this enables deletion
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping(params = "name")
    public List<Book> searchBook(@RequestParam String name) {
        return bookService.searchBook(name);
    }

    @GetMapping(params = "aname")
    public List<Book> searchABook(@RequestParam String aname) {
        return bookService.searchABook(aname);
    }

    @GetMapping(params = "category")
    public List<Book> searchCategory(@RequestParam String category) {
        return bookService.searchCategory(category);
    }
}
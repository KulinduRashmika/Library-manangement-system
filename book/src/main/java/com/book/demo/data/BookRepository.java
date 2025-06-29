package com.book.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByBname(String bname);
    List<Book> findByAname(String aname);
    List<Book> findByCategory(String category);
}
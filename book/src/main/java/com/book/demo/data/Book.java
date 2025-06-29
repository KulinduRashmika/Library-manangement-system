package com.book.demo.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Book" )
public class Book {
    @Id
    @Column(name = "B_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Book_Name")
    private String bname;

    @Column(name = "Author_Name")
    private String aname;

    @Column(name = "Category")
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

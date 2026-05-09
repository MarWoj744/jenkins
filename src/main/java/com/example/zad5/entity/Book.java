package com.example.zad5.entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String title;
    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public Book() {}

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
}

package com.tw.bootcamp.bookshop.book;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String authorName;
    private Integer price;
    private Integer quantity;

    public Book() {
    }

    public Book(String name, String authorName, Integer price) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
    }

    public Book(String name, String authorName, Integer price, Integer quantity) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public Integer getquantity() {
        return quantity;
    }
}

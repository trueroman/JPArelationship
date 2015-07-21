package com.devcolibri.admin.entity;
 
import java.util.Set;

import javax.persistence.*;
 
@Entity
@Table(name = "book")
public class Book {
 
    @Id
    Integer id;
 
    @Column(name = "name")
    private String name;
 
    public Book() {
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
//    @OneToOne(optional = false, mappedBy="book")
//    private Author author;
//     
//    public Author getAuthor() {
//        return author;
//    }
//     
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
    
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "book")
//    private Set<Author> users;
//     
//    public Set<Author> getUsers() {
//        return users;
//    }
//     
//    public void setUsers(Set<Author> users) {
//        this.users = users;
//    }
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "books")
    private Set<Author> users;
     
    public Set<Author> getUsers() {
        return users;
    }
     
    public void setUsers(Set<Author> users) {
        this.users = users;
    }
}
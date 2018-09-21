package com.jeruktutut.jpahibernaterelationmanytoone.service;

import com.jeruktutut.jpahibernaterelationmanytoone.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}

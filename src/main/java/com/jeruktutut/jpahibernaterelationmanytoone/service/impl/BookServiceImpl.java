package com.jeruktutut.jpahibernaterelationmanytoone.service.impl;

import com.jeruktutut.jpahibernaterelationmanytoone.entity.Book;
import com.jeruktutut.jpahibernaterelationmanytoone.repository.BookRepository;
import com.jeruktutut.jpahibernaterelationmanytoone.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}

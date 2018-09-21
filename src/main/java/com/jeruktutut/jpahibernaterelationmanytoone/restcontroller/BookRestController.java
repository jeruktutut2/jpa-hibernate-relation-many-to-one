package com.jeruktutut.jpahibernaterelationmanytoone.restcontroller;

import com.jeruktutut.jpahibernaterelationmanytoone.entity.Book;
import com.jeruktutut.jpahibernaterelationmanytoone.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired private BookService bookService;

    @RequestMapping(method = RequestMethod.GET,value = "/book/all")
    public List<Book> all() {
        return bookService.findAll();
    }
}

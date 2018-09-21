package com.jeruktutut.jpahibernaterelationmanytoone.repository;

import com.jeruktutut.jpahibernaterelationmanytoone.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}

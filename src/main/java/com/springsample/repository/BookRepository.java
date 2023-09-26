package com.springsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsample.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
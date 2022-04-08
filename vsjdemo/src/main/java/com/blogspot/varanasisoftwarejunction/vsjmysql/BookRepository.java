package com.blogspot.varanasisoftwarejunction.vsjmysql;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Iterable<Book> findAllById(Optional<Integer> a);

    Iterable<Book> findByBookName( Optional<String> a);
}
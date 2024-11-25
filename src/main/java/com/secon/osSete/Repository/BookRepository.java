package com.secon.osSete.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secon.osSete.Models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	Optional<Book> findByUrl(String url);
}
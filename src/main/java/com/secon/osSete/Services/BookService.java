package com.secon.osSete.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secon.osSete.Models.Book;
import com.secon.osSete.Models.Comment;
import com.secon.osSete.Repository.BookRepository;
import com.secon.osSete.Repository.CommentRepository;

@Service
public class BookService {

	
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private CommentRepository commentRepository;
	
	public Book stateBooks(Long id, String name, String url, List<Comment> comments) {
		Book bx = new Book(null, name, url, comments);
		bookRepository.save(bx);
		return bx;
	}
	
	
}

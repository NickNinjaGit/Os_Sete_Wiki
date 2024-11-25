package com.secon.osSete.Services;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secon.osSete.Models.Book;
import com.secon.osSete.Models.Comment;
import com.secon.osSete.Models.MyAppUser;
import com.secon.osSete.Repository.BookRepository;
import com.secon.osSete.Repository.CommentRepository;
import com.secon.osSete.Repository.MyAppUserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DBService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private MyAppUserRepository userRepository;
	
	@PostConstruct
	public void instanciaDB() {
		//MyAppUser u1 = new MyAppUser(null, "fulano", "fulano@mail", "123");
		//userRepository.saveAll(Arrays.asList(u1));
		//Book b1 = new Book(null, "livro teste", "/wikis/bento/teste1", null);
		//Comment c1 = new Comment(null, LocalDate.now(),u1, "teste comentario", b1 );
		
	//	bookRepository.saveAll(Arrays.asList(b1));
		//commentRepository.saveAll(Arrays.asList(c1));

	}
}

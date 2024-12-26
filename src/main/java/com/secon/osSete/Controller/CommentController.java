
package com.secon.osSete.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.secon.osSete.Dtos.CommentDTO;
import com.secon.osSete.Models.Comment;
import com.secon.osSete.Repository.BookRepository;
import com.secon.osSete.Services.CommentService;
import com.secon.osSete.Services.MyAppUserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/wikis")
@CrossOrigin
public class CommentController {

	@Autowired
	private CommentService commentService;

	@Autowired
	private MyAppUserService userService;

	@Autowired
	private BookRepository bookRepository;

	public String retornaURI(HttpServletRequest request) {
		String currentEndpoint = request.getRequestURI(); // "/wikis/bento/comments"
		return currentEndpoint;
	}
	

	@PostMapping("/{bookUrl}/comment")
	@ResponseBody
	public Comment createComment(@RequestBody Comment comment, HttpServletRequest request,
			HttpServletResponse response, @PathVariable String bookUrl) {

		response.addHeader("Access-Control-Allow-Origin", "*");

		System.out.println("Valor de bookUrl extraído: " + retornaURI(request));

		comment.setCreatedBy(userService.getLoggedUser());
		comment.setUrl(retornaURI(request));
		comment.setCreatedDate(LocalDate.now());
		return commentService.saveComment(comment);
	}

	/*
	 @GetMapping("/{bookUrl}/comments") public List<Comment>
	 getCommentsByBookUrl(@PathVariable String bookUrl) { return
	 commentService.findCommentsByUrl("/wikis/" + bookUrl + "/comment"); 
	 }*/
	 
	 @GetMapping("/{bookUrl}/comments")
	 public List<CommentDTO> getCommentsByBookUrl(@PathVariable String bookUrl) {
	     List<Comment> comments = commentService.findCommentsByUrl("/wikis/" + bookUrl + "/comment");
	     return comments.stream().map(CommentDTO::new).toList();
	 }

	
}

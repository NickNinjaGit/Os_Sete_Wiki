package com.secon.osSete.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.secon.osSete.Models.Comment;
import com.secon.osSete.Repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	public Comment saveComment(Comment comment) {
		return commentRepository.save(comment);
	}
	
	@Transactional(readOnly = true)
	public List<Comment> getAll(){
		List<Comment> comments = commentRepository.findAll();
		return comments;
	}
	
	
	 public List<Comment> findCommentsByUrl(String url) {
	        return commentRepository.findByBookUrl(url);
	    }
	
}

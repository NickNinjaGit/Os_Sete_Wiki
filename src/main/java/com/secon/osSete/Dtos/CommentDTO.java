package com.secon.osSete.Dtos;

import com.secon.osSete.Models.Comment;

public class CommentDTO {
	private String text;
	private String createdBy;
	private String createdDate;
	
	public CommentDTO(Comment comment) {
		this.text = comment.getText();
		this.createdDate = comment.getCreatedDate() != null ? comment.getCreatedDate().toString() : null;
        this.createdBy = comment.getCreatedBy() != null ? comment.getCreatedBy().getUsername() : null;

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	
}

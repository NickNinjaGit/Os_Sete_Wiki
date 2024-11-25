package com.secon.osSete.Models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate createdDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private MyAppUser createdBy;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	@JsonIgnore
	private Book book;
	
	
	private String url;
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public MyAppUser getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(MyAppUser createdBy) {
		this.createdBy = createdBy;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	 @Override
	    public String toString() {
	        return "Comment{" +
	                "text='" + text + '\'' +
	                ", book='" + book + '\'' +
	                ", user='" + createdBy + '\'' +
	                '}';
	    }

	
}

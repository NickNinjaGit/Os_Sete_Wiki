package com.secon.osSete.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.secon.osSete.Models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	@Query("SELECT c FROM Comment c WHERE c.url = :url AND c.url IS NOT NULL")
	List<Comment> findByBookUrl(@Param("url") String url);

}

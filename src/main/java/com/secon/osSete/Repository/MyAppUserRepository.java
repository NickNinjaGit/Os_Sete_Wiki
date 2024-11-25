package com.secon.osSete.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secon.osSete.Models.MyAppUser;

@Repository
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Long> {
	Optional<MyAppUser> findByUsername(String username);
}

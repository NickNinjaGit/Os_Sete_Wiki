package com.secon.osSete.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.secon.osSete.Models.MyAppUser;
import com.secon.osSete.Repository.MyAppUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MyAppUserService implements UserDetailsService{
	  @Autowired
	    private MyAppUserRepository repository;
	    
	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        
	        Optional<MyAppUser> user = repository.findByUsername(username);
	        if (user.isPresent()) {
	            var userObj = user.get();
	            return User.builder()
	                    .username(userObj.getUsername())
	                    .password(userObj.getPassword())
	                    .build();    
	        }else{
	            throw new UsernameNotFoundException(username);
	        }
	    }
	    
	    public MyAppUser getLoggedUser() {
	    	Authentication authentication = SecurityContextHolder.getContext()
.getAuthentication();
	    	String username = authentication.getName();
	    	
	    	return repository.findByUsername(username)
	    			.orElseThrow(() -> new RuntimeException("Usuario nao encontrado: " + username));
	    
	    }
	
}

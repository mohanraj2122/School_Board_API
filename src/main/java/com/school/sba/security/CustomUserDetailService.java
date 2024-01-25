package com.school.sba.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.school.sba.repository.UserRepositary;




@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepositary userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepo.findByUserName(username).map(user -> new CustomUserDetails(user)).orElseThrow(()-> new UsernameNotFoundException("User name found in the given Id"));
	}
}



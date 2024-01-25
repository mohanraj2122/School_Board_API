package com.school.sba.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.sba.entity.User;
import com.school.sba.enumuration.UserRole;

public interface UserRepositary extends JpaRepository<User, Integer>{

//	Object findByUserName(String username);
	boolean existsByUserRole(UserRole userRole);

	Optional<User> findByUserName(String username);
}

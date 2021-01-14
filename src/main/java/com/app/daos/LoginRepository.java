package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Login;

public interface LoginRepository extends JpaRepository<Login	, Integer> {

	//@Query("")
	
	
}

package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.daos.LoginRepository;
import com.app.pojos.Login;

@Service
@Transactional
public class myLogin implements ILoginService {

	@Autowired
	LoginRepository repo;
	
	
	@Override
	public Login updateAll(Login login) {
		
		System.out.println(login+"in update all");
		Login l=repo.save(login);
		
		return l;
	}

}

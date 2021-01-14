package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.daos.HospitalRepository;
import com.app.pojos.Address;
import com.app.pojos.Hospital;
@Service
@Transactional
public class HospitalTest implements IHospitalService {

	@Autowired
	private HospitalRepository repo;
	
	
	@Override
	public String updateAll(Hospital h) {
		
		Hospital s=new Hospital("abc", "abc", new Address("bcx","dbc","poi",2031));
		
		repo.save(h);
		
		return  "";

	}

	
}




//Hospital s=new Hospital("abc", "abc", new Address("bcx","dbc","poi",2031));

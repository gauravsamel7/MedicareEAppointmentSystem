package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Address;
import com.app.pojos.Hospital;
import com.app.pojos.Login;
import com.app.pojos.Role;
import com.app.service.IHospitalService;
import com.app.service.ILoginService;
import com.app.service.myLogin;


// rushi
// 

@RestController
@RequestMapping("/test")
public class test {

	@Autowired
	IHospitalService hospitalService;
	
	@Autowired
	ILoginService logSer=new myLogin();
	
	@GetMapping("/me")
	public String welcome() {
//		Login login=new Login( "abc@gmail.com", "123", Role.ADMIN	);
//
//		Login l=logSer.updateAll(login);
//		
//			System.out.println("l and id"+l);
//	//	Hospital h=new Hospital("name","23412",new Address(),l);		
//	//	hospitalService.updateAll(h);
//		
		
		
		Login login=new Login( "abc@gmail.com", "123", Role.ADMIN	);

		Login l=logSer.updateAll(login);
		
			System.out.println("l and id"+l);
		Hospital h=new Hospital("name","23412",new Address(),l);
		
		hospitalService.updateAll(h);
		
		
		return "hello";
	}
	
	
}
//++++++++++++++++
package com.pauloricardo.workshopmongoDb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pauloricardo.workshopmongoDb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User paulo = new User("1", "Paulo Ricardo", "prmsantosster@gmail.com");
		User ricardo = new User("1", "Ricardo Augusto", "ricardoguto@gmail.com");
		User edu = new User("1", "Paulo Eduardo", "edu_bola@gmail.com");
		User evonira = new User("1", "Evonira Santos", "evosimoes@gmail.com");
		User brenno = new User("1", "Brenno Santos", "brennosantos@gmail.com");
		User yeslim = new User("1", "Yeslim Santos", "yeslim@gmail.com");
		
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(paulo, ricardo, edu, evonira, brenno, yeslim));
		return ResponseEntity.ok().body(list);		
	}

}
 
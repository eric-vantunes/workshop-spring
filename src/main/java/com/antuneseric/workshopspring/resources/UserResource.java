package com.antuneseric.workshopspring.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.antuneseric.workshopspring.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>>  findAll() {
		User eric = new User("1", "Eric Antunes", "ericantunes@gmail.com");
		User alan = new User("2", "Alan Silva", "Alan@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(eric, alan));
		return ResponseEntity.ok().body(list);	
	}
}

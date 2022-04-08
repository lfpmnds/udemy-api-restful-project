package com.lfpmnds.udemyapirestfulproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfpmnds.udemyapirestfulproject.domain.User;
import com.lfpmnds.udemyapirestfulproject.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}

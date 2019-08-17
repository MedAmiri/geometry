package org.geometry.user.service.impl;

import org.geometry.user.entities.User;
import org.geometry.user.repository.UserRepository;
import org.geometry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findUserById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public void SaveUser(User user) {
		userRepository.save(user);
	}

}

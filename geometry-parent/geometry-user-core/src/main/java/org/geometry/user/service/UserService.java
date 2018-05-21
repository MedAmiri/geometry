package org.geometry.user.service;

import org.geometry.user.entities.User;

public interface UserService {
	
	public User findUserById(Long id);
	
	public void SaveUser(User user);
}

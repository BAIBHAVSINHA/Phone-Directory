package com.infotech.dao;

import com.infotech.model.User;

public interface UserDAO {
	public abstract boolean saveUser(User user);
	public User getUserDetailsByEmailAndPassword(String email,String password);
}

package com.hms.dao.service;

import com.hms.model.Login;

public interface LoginDao {
	int insertLogin(Login login);
	int updateLogin(Login login);
	int deleteLogin(String userId);
	
	boolean checkLogin(Login login);
}

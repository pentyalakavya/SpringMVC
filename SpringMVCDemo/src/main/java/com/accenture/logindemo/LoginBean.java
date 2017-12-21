package com.accenture.logindemo;

import org.springframework.stereotype.Component;

@Component
public class LoginBean {
public boolean isAuthentic(String userName, String password)
{
	if(userName.equalsIgnoreCase("admin") && password.equals("password"))
	return true;
	else
		return false;
}
}

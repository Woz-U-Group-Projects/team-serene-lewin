package com.menu.authorization;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Document(collection="employee")   

public class EmployeeEntity   {
	
	public String  UserName;
	public String  Password;
	
	public String getUserName() {
	 return UserName;

    }
	public void setUserName(String newUserName) {
		this.UserName = UserName;
	}
	
	public String getPassWord() {
		return Password;
	}
	
	public void setPassWord(String newPassWord) {
		this.Password = Password;
	}
	
	
	
}
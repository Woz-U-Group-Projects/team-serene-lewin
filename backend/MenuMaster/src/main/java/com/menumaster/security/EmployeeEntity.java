package com.menumaster.security;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee") 

public class EmployeeEntity {
	
	public String  UserName;
	public String  Password;
	
	public String getUserName() {
	 return UserName;

    }
	public void setUserName(String newUserName, String UserName) {
		this.UserName = UserName;
	}
	
	public String getPassWord() {
		return Password;
	}
	
	public void setPassWord(String newPassWord, String Password) {
		this.Password = Password;
	}	
}
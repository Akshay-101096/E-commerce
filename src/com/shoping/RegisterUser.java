package com.shoping;

public class RegisterUser {
			public String name;
			public String Username;
			public String Password; 
			
			
			//Create Constructor To Store Username,Password
	 public RegisterUser(String name,String Username,String Password) {
		 super();
		 this.name = name;
		 this.Username = Username;
		 this.Password = Password;
	 }

	 @Override
	public String toString() {
		return "RegisterUser [Username=" + Username + ", Password=" + Password + "]";
	}
	
	//getter for name
	 public String getName() {
		return name;
	}
	 //setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter method for Username
	public String getUsername() {
		return Username;
	}
	
	//setter method for Username
	public void setUsername(String username) {
		Username = username;
	}
	
	//getter method for password
	public String getPassword() {
		return Password;
	}
	
	//setter method for password
	public void setPassword(String password) {
		Password = password;
	}
}

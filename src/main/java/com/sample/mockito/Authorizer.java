package com.sample.mockito;

public class Authorizer{
	
	private final String name;
	private final String pswd;
	private AuthInterface mInterface;
	
	
	public Authorizer(String n, String p, AuthInterface authFace) {
		this.name = n;
		this.pswd = p;
		this.mInterface = authFace;
	}
	
	public String greetMessage() {
		if(authenticateUser(this.name, this.pswd)) {
			return "Welcome " + name;
		}else {
			return "Auth failed";
		}
	}
	
	public boolean authenticateUser(String name, String pswd) {
		if(this.mInterface.authenticate(name, pswd)) {
			return true;
		}else {
			return false;
		}
	}
	
}

package com.sample.mockito;

public class AuthInterfaceImpl implements AuthInterface{

	@Override
	public boolean authenticate(String uname, String pswd) {
		if(uname.length() == pswd.length()) {
			return true;
		}else {
			return false;
		}
	}

}

package com.sample.mockito;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
		
	@RequestMapping("/test")
	public String getUser(@RequestParam(value = "name") String username, @RequestParam(value = "pswd") String password) {
		
		AuthInterfaceImpl impl = new AuthInterfaceImpl(); 
		Authorizer authorizedUser = new Authorizer(username, password, impl);
		
		return authorizedUser.greetMessage();
	}
}

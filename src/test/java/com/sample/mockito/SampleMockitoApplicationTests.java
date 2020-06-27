package com.sample.mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleMockitoApplicationTests {

	@Test
	void contextLoads() {
		AuthInterface mockInterface;
		Authorizer authorizer;
		String uname = "Harry Kane";
		String pswd = "randomPwsd";
		
		mockInterface = Mockito.mock(AuthInterface.class);
		when(mockInterface.authenticate(uname, pswd)).thenReturn(true);
		
		authorizer = new Authorizer(uname, pswd, mockInterface);
		String returnValue = authorizer.greetMessage(); 
		assertFalse(returnValue.equals("Welcome "));
		assertTrue(returnValue.equals("Welcome " + uname));
		System.out.println(returnValue);
	}

}

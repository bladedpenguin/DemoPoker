package com.catalyst.demoqa.PageObject;

import static org.junit.Assert.*;

import org.catalystitservices.PageObjectFramework.Framework.PageObjectTest;
import org.junit.Before;
import org.junit.Test;

public class DemoQAContactTest extends PageObjectTest{
	DemoQAContact contactPage; 
	
	@Before
	public void setup(){
		contactPage = (new DemoQAHome(getDriver())).goContact();
	}
	
	@Test
	public void happyPathTest(){
		contactPage.enterName("Kairos")
		.enterEmail("kairos@lolcat.com")
		.enterSubject("hungry cats")
		.enterMessage("omg feed me")
		.send();
		
		assertTrue(contactPage.getError().toLowerCase().contains("success"));
		assertFalse(contactPage.isNameError());
		assertFalse(contactPage.isEmailError());
	}
}

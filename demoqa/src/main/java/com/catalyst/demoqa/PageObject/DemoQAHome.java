package com.catalyst.demoqa.PageObject;

import org.openqa.selenium.WebDriver;

public class DemoQAHome extends DemoQA {

	public DemoQAHome(WebDriver driver) {
		super(driver);
		_url = "http://demoqa.com";
        goTo(_url);
	}

}

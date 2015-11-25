package com.catalyst.demoqa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAServices extends DemoQA {

	public static By title = By.xpath("//*[@id='post-114']/header/h1");
	public static By content = By.xpath("//*[contains(@class,'entry-content')]");
	
	
	public DemoQAServices(WebDriver driver) {
		super(driver);
	}

	public boolean checkServices() {
		return title.findElement(_driver).getText().contains("Services");
	}
	
	public String getContent(){
		return _driver.findElement(content).getText();
	}
}

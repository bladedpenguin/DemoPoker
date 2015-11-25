package com.catalyst.demoqa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAAbout extends DemoQA {
	
	public static By title = By.xpath("//*[@id='post-156']/header/h1");
	public static By content = By.xpath("//*[contains(@class,'entry-content')]");

	public DemoQAAbout(WebDriver driver) {
		super(driver);
	}

	public boolean checkAbout() {
		title.findElement(_driver).getText().contains("About us");
		return false;
	}
	
	public String getContent(){
		return _driver.findElement(content).getText();
	}

}

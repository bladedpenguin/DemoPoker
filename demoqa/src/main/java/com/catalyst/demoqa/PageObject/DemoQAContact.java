package com.catalyst.demoqa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAContact extends DemoQA {

	private static By title = By.xpath("//*[@id='post-28']/header/h1");
	private static By nameBox = By.xpath("//input[@name='your-name']");
	private static By emailBox = By.xpath("//input[@name='your-email']");
	private static By emailError = By.xpath("//*[@id='wpcf7-f375-p28-o1']/form/p[2]/span/span");
	private static By nameError = By.xpath("//*[@id='wpcf7-f375-p28-o1']/form/p[1]/span/span");
	private static By subjectBox = By.xpath("//input[@name='your-subject']");
	private static By messageBox = By.xpath("//textarea[@name='your-message']");
	private static By sendButton = By.xpath("//input[@type='submit']");
	private static By response = By.xpath("//*[contains(@class,'wpcf7-response-output')]");
	
	
	public DemoQAContact(WebDriver driver) {
		super(driver);
	}
	
	public boolean checkContact(){
		WebElement head = title.findElement(_driver); 
		return head.getText().contains("Contact");
	}
	
	public DemoQAContact enterName(String name){
		nameBox.findElement(_driver).sendKeys(name);
		return this;
	}
	public Boolean isNameError(){
		return _driver.findElements(nameError).size() > 0;
	}
	public String getNameError(){
		return nameError.findElement(_driver).getText();
	}
	
	public DemoQAContact enterEmail(String email){
		emailBox.findElement(_driver).sendKeys(email);
		return this;
	}
	
	public Boolean isEmailError(){
		return _driver.findElements(emailError).size() > 0;
	}
	
	public String getEmailError(){
		return emailError.findElement(_driver).getText();
	}
	
	public DemoQAContact enterSubject(String subject){
		subjectBox.findElement(_driver).sendKeys(subject);
		return this;
	}
	
	public DemoQAContact enterMessage(String message){
		messageBox.findElement(_driver).sendKeys(message);
		return this;
	}
	
	public DemoQAContact send(){
		click(sendButton);
		return this;
	}
	
	public String getError(){
		waitForElementToContainText(response,10000);
		return response.findElement(_driver).getText();
		//return getInnerHtml(response);
	}
}

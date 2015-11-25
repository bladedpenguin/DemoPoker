package com.catalyst.demoqa.PageObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQABlog extends DemoQA {
	
	private static By posts = By.xpath("//article");
	
	private static SimpleDateFormat timeFormat =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");

	public DemoQABlog(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getPostNames(){
		List<WebElement> blags  = _driver.findElements(posts);
		List<String> ids = new ArrayList<String>();
		for (WebElement we : blags){
			ids.add(we.getAttribute("id"));
		}
		return ids;
	}
	
	public Boolean checkImage(String articleID){
		return _driver.findElement(By.id(articleID)).findElements(By.tagName("img")).size() > 0;
	}
	
	public String getContent(String articleID){
		return _driver.findElement(By.id(articleID)).findElement(By.xpath("//*[contains(@class,'entry-excerpt')]")).getText();
	}
	public String getTitle(String articleID){
		return _driver.findElement(By.id(articleID)).findElement(By.xpath("//*[contains(@class, 'entry-title')]")).getText();
	}
	public Date getDate(String articleID) throws ParseException{
		return timeFormat.parse(_driver.findElement(By.id(articleID)).findElement(By.tagName("time")).getAttribute("datetime"));
	}
	public DemoQABlog go(String articleID){
		_driver.findElement(By.id(articleID)).findElement(By.xpath("//*[contains(@class, 'entry-title')]")).click();
		return this;
	}
}

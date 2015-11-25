package com.catalyst.demoqa.PageObject;

import org.catalystitservices.PageObjectFramework.Framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQA extends PageObject{
	
	private static By navbarHome = By.xpath("//*[@id=\"menu-item-38\"]/a");
	private static By navbarAbout = By.linkText("About us");
	private static By navbarServices = By.linkText("Services");
	private static By navbarDemo = By.linkText("Demo");
	private static By navbarDemoDraggable = By.linkText("Draggable");
	private static By navbarDemoTabs = By.xpath("//*[@id='menu-item-153']/a");
	private static By navbarBlog = By.xpath("//*[@id='menu-item-65']/a");
	private static By navbarContact = By.xpath("//*[@id='menu-item-64']/a");
	
	private static By sidebarRegistration = By.xpath("//*[@id='menu-item-374']/a");
	private static By sidebarDraggable = By.xpath("//*[@id='menu-item-140']/a");
	private static By sidebarDroppable = By.xpath("//*[@id='menu-item-141']/a");
	private static By sidebarResizable = By.xpath("//*[@id='menu-item-143']/a");
	private static By sidebarSelectable = By.xpath("//*[@id='menu-item-142']/a");
	private static By sidebarSortable = By.xpath("//*[@id='menu-item-142']/a");
	private static By sidebarAccordion = By.xpath("//*[@id='menu-item-144']/a");
	private static By sidebarAutocomplete = By.xpath("//*[@id='menu-item-145']/a");
	private static By sidebarDatepicker = By.xpath("//*[@id='menu-item-146']/a");
	private static By sidebarMenu = By.xpath("//*[@id='menu-item-147']/a");
	private static By sidebarSlider = By.xpath("//*[@id='menu-item-97']/a");
	private static By sidebarTabs = By.xpath("//*[@id='menu-item-98']/a");
	private static By sidebarTooltip = By.xpath("//*[@id='menu-item-99']/a");
	
	private static By sidebarFramesAndWindows = By.xpath("//*[@id='menu-item-148']/a");
	
	private static By footerAboutText = By.xpath("//*[@id='text-2']/div");
	private static By footerCopyrightToolsQA = By.xpath("//*[@id='colophon']//a[contains(text(),'ToolsQA')]");
	private static By footerCopyrightOneiric  = By.xpath("//*[@id='colophon']//a[contains(text(),'Oneiric')]");
	
	private static By facebookLink = By.xpath("//*[@id='ipt-kb-social-widget-2']//a[contains(@title,'Facebook')]");
	private static By twitterLink = By.xpath("//*[@id='ipt-kb-social-widget-2']//a[contains(@title,'Twitter')]");
	private static By gPlusLink = By.xpath("//*[@id='ipt-kb-social-widget-2']//a[contains(@title,'Google Plus')]");
	
	
	
	public DemoQA(WebDriver driver) {
		super(driver);
		System.out.println(this.getClass());
	}
	
	public void go(){
		_url = "http://demoqa.com";
        goTo(_url);
	}
	
	public DemoQAHome goHome(){
		click(navbarHome);
		return new DemoQAHome(_driver);
	}
	
	public DemoQAAbout goAbout(){
		click(navbarAbout);
		return new DemoQAAbout(_driver);
	}
	
	public DemoQAServices goServices(){
		click(navbarServices);
		return new DemoQAServices(_driver);
	}
	
	public DemoQADemoDraggable goDemoDraggable(){
		click(navbarDemo);
		click(navbarDemoDraggable);
		return new DemoQADemoDraggable(_driver);
	}
	
	public DemoQATabs goDemoTabs() {
		click(navbarDemo);
		click(navbarDemoTabs);
		return new DemoQATabs(_driver);
	}
	public DemoQABlog goBlog() {
		click(navbarBlog);
		return new DemoQABlog(_driver);
	}
	public DemoQAContact goContact() {
		click(navbarContact);
		return new DemoQAContact(_driver);
	}
	
	public DemoQA clickSidebarRegistration(){
		click(sidebarRegistration);
		return this;
	}
	public DemoQA clickSideBarDraggable(){
		click(sidebarDraggable);
		return this;
	}
	public DemoQA clickSidebarDroppable(){
		click(sidebarDroppable);
		return this;
	}
	public DemoQA clickSidebarResizable(){
		click(sidebarResizable);
		return this;
	}
	public DemoQA clickSidebarSelectable(){
		click(sidebarSelectable);
		return this;
	}
	public DemoQA clickSidebarSortable(){
		click(sidebarSortable);
		return this;
	}
	public DemoQA clickSidebarAccordion(){
		click(sidebarAccordion);
		return this;
	}
	public DemoQA clickSidebarAutocomplete(){
		click(sidebarAutocomplete);
		return this;
	}
	public DemoQA clickSidebarDatepicker(){
		click(sidebarDatepicker);
		return this;
	}
	public DemoQA clickSidebarMenu(){
		click(sidebarMenu);
		return this;
	}
	public DemoQA clickSidebarSlider(){
		click(sidebarSlider);
		return this;
	}
	public DemoQA clickSidebarTabs(){
		click(sidebarTabs);
		return this;
	}
	public DemoQA clickSidebarTooltip(){
		click(sidebarTooltip);
		return this;
	}
	public DemoQA clickSidebarFramesAndWindows(){
		click(sidebarFramesAndWindows);
		return this;
	}
	
	public String getFooterAboutText(){
		return _driver.findElement(footerAboutText).getText();
	}
	public PageObject goFooterCopyrightToolsQA(){
		click(footerCopyrightToolsQA);
		return new PageObject(_driver);
	}
	public PageObject goFooterCopyrightOneiric(){
		click(footerCopyrightOneiric);
		return new PageObject(_driver);
	}
	public PageObject goFacebook(){
		click(facebookLink);
		return new PageObject(_driver);
	}
	public PageObject goTwitter(){
		click(twitterLink);
		return new PageObject(_driver);
	}
	public PageObject goGooglePlus(){
		click(gPlusLink);
		return new PageObject(_driver);
	}
}

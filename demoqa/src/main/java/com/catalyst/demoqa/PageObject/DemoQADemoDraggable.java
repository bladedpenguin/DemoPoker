package com.catalyst.demoqa.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoQADemoDraggable extends DemoQA {
	
	private static By tabDefault = By.xpath("//*[@id='ui-id-1']");
	private static By tabConstrained = By.xpath("//*[@id='ui-id-2']");
	private static By tabCursorStyle = By.xpath("//*[@id='ui-id-3']");
	private static By tabEvents = By.xpath("//*[@id='ui-id-4']");
	private static By tabDragnSort = By.xpath("//*[@id='ui-id-3']");
	
	private static By draggables = By.xpath("//*[contains(@class,'ui-draggable')]]");
	
	private static By draggable = By.id("draggable");
	private static By dragVertical = By.id("draggabl");
	private static By dragHorizontal = By.id("draggabl2");
	private static By dragConstrainedToParent = By.id("draggabl5");
	private static By dragConstrainedToBox = By.id("draggabl3");
	private static By dragByTopLeft = By.id("drag2");
	private static By dragByCenter = By.id("drag");
	private static By dragByBottom = By.id("drag3");
	
	private Actions builder;

	public DemoQADemoDraggable(WebDriver driver) {
		super(driver);
		builder = new Actions(_driver);
	}
	
	/**
	 * Click on the Default tab on this page
	 * @return
	 */
	public DemoQADemoDraggable goToDefault(){
		click(tabDefault);
		return this;
	}
	
	/**
	 * Click on the Constrain Movement tab on this page.
	 * @return
	 */
	public DemoQADemoDraggable goToConstrained(){
		click(tabConstrained);
		return this;
	}
	
	/**
	 * Click on the Cursor Style tab on this page
	 * @return the same page object this is called on
	 */
	public DemoQADemoDraggable goToCursorStyle(){
		click(tabCursorStyle);
		return this;
	}
	
	/**
	 * Click on the Events Tab on this page
	 * @return the same page object this is called on
	 */
	public DemoQADemoDraggable goToEvents(){
		click(tabEvents);
		return this;
	}
	
	/**
	 * Click on the Draggable + Sortable Tab on this page
	 * @return the same page object this is called on
	 */
	public DemoQADemoDraggable goToDragnSort(){
		click(tabDragnSort);
		return this;
	}
	
	public List<String> getVisibleDraggables(){
		List<WebElement> d = _driver.findElements(draggables);
		List<String> s = new ArrayList<String>();
		for(WebElement e : d){
			if (e.isDisplayed()){
				s.add(e.getAttribute("id"));
			}
		}
		return s;
	}
	
	/**
	 * Drag the selected draggable by an Offset
	 * @param id - the id of the draggable to affect
	 * @param offset - how much to move the draggable
	 * @return the same page object this is called on
	 */
	public DemoQADemoDraggable dragDefault(String id, Point offset){
		builder.dragAndDropBy(_driver.findElement(By.id(id)), offset.x, offset.y);
		return this;
	}
	
	public Point GetDraggableLocation(String id){
		return _driver.findElement(By.id(id)).getLocation();
	}
	
	public DemoQADemoDraggable dragPointToPoint(String id, Point initialOffset, Point finalOffset){
		builder.moveToElement(_driver.findElement(By.id(id)), initialOffset.x , finalOffset.y)
		.clickAndHold()
		.moveByOffset(finalOffset.x, finalOffset.y)
		.release();
		return this;
	}
	
	
	//public 
//
	
//	
//	/**
//	 * Drag the draggable that is supposed to be only able to move vertically by an offset
//	 * @param xOffset
//	 * @param yOffset
//	 * @return
//	 */
//	public DemoQADemoDraggable dragVertical(Point offset){
//		goConstrained();
//		builder.dragAndDropBy(_driver.findElement(dragVertical), offset.x, offset.y);
//		return this;
//	}
//	public DemoQADemoDraggable dragHorizontal(Point offset){
//		goConstrained();
//		builder.dragAndDropBy(_driver.findElement(dragHorizontal), offset.x, offset.y);
//		return this;
//	}
//	
//	public DemoQADemoDraggable dragConstrainedToParent(int xOffset, int yOffset){
//		goConstrained();
//		builder.dragAndDropBy(_driver.findElement(dragConstrainedToParent), xOffset, yOffset);
//		return this;
//	}
//	
//	public DemoQADemoDraggable dragConstrainedToBox(int xOffset, int yOffset){
//		goConstrained();
//		builder.dragAndDropBy(_driver.findElement(dragConstrainedToBox), xOffset, yOffset);
//		return this;
//	}
//	
//	public DemoQADemoDraggable dragByTopLeft(int xStartingOffset, int yStartingOffset, int xOffset, int yOffset){
//		goCursorStyle();
//		builder.dragAndDropBy(_driver.findElement(dragByTopLeft), xOffset, yOffset);
//		return this;
//	}
//	
//	public DemoQADemoDraggable dragByTopLeft(int xOffset, int yOffset){
//		goCursorStyle();
//		builder.dragAndDropBy(_driver.findElement(dragByTopLeft), xOffset, yOffset);
//		return this;
//	}
}

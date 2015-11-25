package com.catalyst.demoqa.PageObject;

import static org.junit.Assert.*;

import org.catalystitservices.PageObjectFramework.Framework.PageObjectTest;
import org.junit.Before;
import org.junit.Test;

import com.catalyst.demoqa.PageObject.DemoQA;

public class DemoQATest extends PageObjectTest{
	private DemoQA demo;
	
	@Before
	public void setup(){
		demo = new DemoQAHome(getDriver());
		//DemoQAContact contact = demo.goContact();
		//System.out.print(demo.goContact().checkContact());
	}

	@Test
	public void testNavContact(){
		assertTrue(demo.goContact().checkContact());
	}
	@Test
	public void testNavAbout(){
		assertTrue(demo.goAbout().checkAbout());
	}
	
	@Test
	public void testNavServices(){
		assertTrue(demo.goServices().checkServices());
	}
	
	@Test
	public void testNavDemoDraggable(){
		assertTrue(demo.goDemoDraggable().checkDemoDraggable());
	}
}

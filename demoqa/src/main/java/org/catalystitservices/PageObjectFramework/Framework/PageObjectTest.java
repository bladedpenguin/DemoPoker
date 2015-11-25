package org.catalystitservices.PageObjectFramework.Framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

public class PageObjectTest extends SeleniumDriver {
	
	private static String _logName = SeleniumSettings.getSeleniumLogName();
	private static SeleniumLogger _logger = SeleniumLogger.getLogger(_logName);
	
	private static long _suiteStartTime;
	private static long _testStartTime;
	
	@Rule public TestName name = new TestName();

	@BeforeClass
	public static void BeforeClass()
	{
		_logger.logStartTestSuite();
		_suiteStartTime = System.currentTimeMillis();
	}
	
	@Before
	public void BeforeEach()
	{
		_logger.logStartTest(name.getMethodName());
		_testStartTime = System.currentTimeMillis();
	}
	
	@After
	public void AfterEach()
	{
		_driver.manage().deleteAllCookies();
		_driver.quit();
		_driver = null;
	}
	
	
	
	@AfterClass
	public static void AfterClass()
	{
		_logger.logFinishTestSuite();
		double totalTime = ((double)(System.currentTimeMillis() - _suiteStartTime))/1000;
		_logger.logTime("Total Time", totalTime);
		_logger.logDashedLine();
		killDrivers();
	}
	
	private static void killDrivers()
	{
		
	}
}

package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage lp= null;
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		lp = new LoginPage(driver);
	}
	
	@Test
	public void test01() {
		lp.loginToApplication();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test02() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran1 | Dashboard");
	}
	
	@Test
	public void test03() {
		throw new SkipException("skip the testcase");
	}
}

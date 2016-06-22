package com.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScript001 {

	WebDriver driver = new FirefoxDriver();

	@BeforeClass()
	public void setUp() {
		System.out.println("This  is a setUp method");
	}

	@Test
	public void f() {
		driver.get("https://ui-dev.vuforia.com");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("edit-popup-user-name-login")).sendKeys(
				"vumarkdev@tcs.com");
		driver.findElement(By.id("edit-popup-user-pass-login")).sendKeys(
				"Test12345");
		driver.findElement(By.id("edit-login-submit")).click();
	}
	@BeforeClass()
	public void tearDown() {
		System.out.println("This is a tear Down method");
	}
}

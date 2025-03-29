package com.tka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation {
	@Test(dataProvider = "td")

	void testcase(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shani/Documents/dhara-learning/7-TESTING/@@@Selenium/%23%23projects/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

	}

	@DataProvider(name = "td")
	Object[][] testData() {
		Object obj[][] = new Object[4][2];

		obj[0][0] = "Kiran@gmail.com";
		obj[0][1] = "123456";

		obj[1][0] = "abc123@gmail.com";
		obj[1][1] = "Abc@123";

		obj[2][0] = "$$$$";
		obj[2][1] = "$$$$~~~~";
		
		obj[3][0] = "  ";
		obj[3][1] = "  ";

		return obj;
		
	}
}

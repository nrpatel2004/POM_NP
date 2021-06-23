/**
 * 
 */
package com.wordpressUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author nsqaure
 *
 */
public class openBrowser {

	
	public static WebDriver openURL(String url)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
}

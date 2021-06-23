/**
 * 
 */
package com.wordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author nsqaure
 *
 */
public class CalcPage {

	  WebDriver driver;
	By hValue = By.id("homeval");
	By dPayment = By.xpath("//*[@id=\"downpayment\"]");
	By loanPayment = By.id("loanamt");
	By interestRate = By.id("intrstsrate");
	By buttonCalculate = By.name("cal");

	public CalcPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void CalculatePayment(String homeValue,String downPayment, String loanpay, String iRate)
	{
	    driver.findElement(hValue).sendKeys(homeValue);
	    driver.findElement(dPayment).sendKeys(downPayment);
	    driver.findElement(loanPayment).sendKeys(loanpay);
	    driver.findElement(interestRate).sendKeys(iRate);
	    driver.findElement(buttonCalculate).click();
	}
	
}

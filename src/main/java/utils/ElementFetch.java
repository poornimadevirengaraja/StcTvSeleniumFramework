package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class ElementFetch extends BaseTest{
	
	
	public WebElement getWebElement(String identifiertype, String identifiervalue) {
		switch(identifiertype) {
		case "XPATH":
		return BaseTest.driver.findElement(By.xpath(identifiervalue));
		case "CSS":
		return BaseTest.driver.findElement(By.cssSelector(identifiervalue));
		case "ID":
		return BaseTest.driver.findElement(By.id(identifiervalue));
		case "NAME":
		return BaseTest.driver.findElement(By.name(identifiervalue));
		case "TAGNAME":
		return BaseTest.driver.findElement(By.tagName(identifiervalue));
		
		 default:
			 return null;

		}		
	}
	
	public List<WebElement> getWebElements(String identifiertype, String identifiervalue) {
		switch(identifiertype) {
		case "XPATH":
		return BaseTest.driver.findElements(By.xpath(identifiervalue));
		case "CSS":
		return BaseTest.driver.findElements(By.cssSelector(identifiervalue));
		case "ID":
		return BaseTest.driver.findElements(By.id(identifiervalue));
		case "NAME":
		return BaseTest.driver.findElements(By.name(identifiervalue));
		case "TAGNAME":
		return BaseTest.driver.findElements(By.tagName(identifiervalue));
		
		 default:
			 return null;
		}		
	}

}

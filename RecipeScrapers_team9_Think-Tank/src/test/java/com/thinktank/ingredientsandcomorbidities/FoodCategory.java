package com.thinktank.ingredientsandcomorbidities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thinktank.core.BaseClass;

public class FoodCategory extends BaseClass {

	public String recipeId() {

		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.click();

		searchBox.sendKeys("Veg");
		driver.findElement(By.xpath("//input[@value='search']")).click();
	//	List<WebElement> recipes_names = driver.findElements(By.className("rcc_recipename"));
		//List<WebElement> recipes = driver.findElements(By.className("rcc_recipecard"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		List<WebElement> pages_full_data = driver.findElements(By.xpath("//div[contains(text(),'Goto Page')]/a"));
		WebElement element_1_XX = pages_full_data.get(pages_full_data.size() - 1);
          String pagination_last_page_XX = element_1_XX.getText();
		
		
		
		
		
		
		

		/*List<WebElement> recipeNames = driver.findElements(By.xpath("//div//span[@class='rcc_recipename']"));

		for (int i = 0; i < recipeNames.size(); i++) {
			WebElement element = recipeNames.get(i);
			String recipeName = element.getText();
			System.out.println("Clicking on recipe: " + recipeName);

			element.click();
			driver.navigate().back();
			recipeNames = driver.findElements(By.xpath("//div//span[@class='rcc_recipename']"));
		}*/
		return null;

	}

}

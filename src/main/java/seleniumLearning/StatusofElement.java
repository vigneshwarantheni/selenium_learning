package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement  element=driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/p[4]"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		
		//is selected();
		
		WebElement male=driver.findElement(By.xpath("//*[@id=\"male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"female\"]"));
		
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
			}

}

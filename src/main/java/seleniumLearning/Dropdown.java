package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		country.selectByValue("ASM");
	}
	 public String selectfromDropDown(WebElement element,String option) {
		 Select obj=new Select(element);
		 obj.selectByValue(option);
		 return obj.getFirstSelectedOption().getText();
	 }

}

package seleniumLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement> option = select.getOptions();
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
        for(WebElement options: option)
        {
        	originallist.add(options.getText());
        	templist.add(options.getText());
        }
        	
            Collections.sort(templist);
            
            System.out.println("original list"+originallist);
            System.out.println("sorted list are" +templist);
	
	if(originallist.equals(templist)) {
		System.out.println("sorted list are matched");
		
	}
	else {
		System.out.println("sorted list are not matched");
	}
	
}

}

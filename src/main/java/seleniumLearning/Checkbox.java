package seleniumLearning;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// single checkbox
		
		driver.findElement(By.id("checkBox1")).click();
		
		// click all checkbox
		
		List<WebElement>all= driver.findElements(By.xpath("//input[@class='checkBoxClassB']"));
	System.out.println("no.of checkbox"+ all.size());
	
	/*for(WebElement checkbox:all) {
		
		checkbox.click();
		
	}
		*/
	
		for(WebElement chbox:all) {
			String checkbox =chbox.getAttribute("name");
			if(checkbox.equals("checkBoxName2")|| checkbox.equals("checkBoxName4")) {
				chbox.click();
				
				
				
			}
			
		}

	}

}

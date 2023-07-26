package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement>table=driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
System.out.println("no.of colum" +table.size());

List<WebElement>rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	System.out.println("no of rows"+ rows.size());
	}

}

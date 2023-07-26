package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//li[@class='sa_sg as_extra_pad']//span
public class Dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\driver.exe" );
		
		WebDriver driver=new ChromeDriver(chromeOptions);
	    
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("q")).sendKeys("vijay actor");
		List<WebElement>ele= driver.findElements(By.xpath("//div[@class='lnnVSe']"));
		System.out.println("size of auto suggistion:"  + ele.size());
		
		for(WebElement list :ele) {
			if(list.getText().contains("vijay actor instagram")) {
				list.click();
				break;
			}
		}
		
	}

}

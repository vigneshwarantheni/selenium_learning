package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoosttrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver(op);
				driver.get("https://mdbootstrap.com/docs/standard/components/dropdowns/");
				driver.manage().window().maximize();
				driver.findElement(By.id("dropdownMenuButton")).click();
	}

}

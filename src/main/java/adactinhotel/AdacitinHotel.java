package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdacitinHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-orginis=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("facebook.com");
		
		
		
	}

}

package seleniumLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	private static String tittle;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("tabButton")).click();
		Set<String>  windowhnds=driver.getWindowHandles();
		
		List<String> windowidlist=new ArrayList(windowhnds);
		String parentwindow=windowidlist.get(0);
		String childwindow=windowidlist.get(1);
		
		System.out.println("parentwindow ID:" +parentwindow );
		System.out.println("parentwindow ID" +childwindow );
		
		driver.switchTo().window(parentwindow);
		System.out.println("tittle"+driver.getTitle());
	
		
		driver.switchTo().window(childwindow);
		System.out.println("tittle"+driver.getTitle());
		
		
	
		String tittle = "tittleDEMOQA";
		if(tittle.equals("tittleDEMOQA")) {
			
			driver.close();
			
		}

		
		
	}

}

package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingwebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("no of rows are :" + rows);
		
		int colum=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("no of colum:" + colum);
		
		//Retrive specific row and colum data
		
		String value=driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[2]")).getText();
		System.out.println("the value is:" + value);
		
		Thread.sleep(3000);
		//retrive all the data form table
		
		System.out.println("DATAVFROM THE TABLE");
		
		for(int r=1;r<=rows;r++) {
			
			for(int c=1;c<=colum;c++) {
				
				String valuedata=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println("the value is:" + valuedata);
			}
		}

		driver.quit();
		
		
	}

}

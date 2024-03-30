package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//interface-contain group of methods with empty bodies.its class responsibility to implements methods
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();  // object access personal class method of chromedriver
		driver.get("https://www.w3schools.com/");
		//driver.getTitle();
		System.out.println(driver.getCurrentUrl());
	}

}

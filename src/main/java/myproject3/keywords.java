package myproject3;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.ObjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
	public void open() {
		System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 try {
			fis=new FileInputStream("E:\\eclipse workspace\\java_1\\myproject3\\objectrepositories");
			 prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void url(String httpurl) {
		driver.get(httpurl);
    	
}
	public void input(String testdata, String objectName) {
	driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testdata);
		
	}
	public void click(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}
}

package DataProviderConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchPriceOfProductOnAmazonByDataProvider {
	
	@Test(dataProvider = "getData")
	public void getprice(String Brand,String Product) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Brand,Keys.ENTER);
		String Price = driver.findElement(By.xpath("//span[text()='"+Product+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
        //String text = driver.findElement(By.xpath("//span[text()='"+Product+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='₹']/following-sibling::span")).getText();
		//String text  = driver.findElement(By.xpath("//span[text()='"+Product+"']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/span[2]/span[2]")).getText();
		System.out.println(Price);
		driver.quit();
		
		 
	}
	@DataProvider
	public Object[][] getData() {

		Object[][] ObjArr = new Object[3][2];
		ObjArr[0][0] = "iphone";
		ObjArr[0][1] = "Apple iPhone 15 (128 GB) - Black";
		ObjArr[1][0] = "iphone";
		ObjArr[1][1] = "Apple iPhone 16 Pro (128 GB) - Desert Titanium";
		ObjArr[2][0] = "iphone";
		ObjArr[2][1] = "Apple iPhone 16 Pro Max (256 GB) - Black Titanium";
		return ObjArr;
	}

}

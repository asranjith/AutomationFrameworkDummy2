package LearnTestNGScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class TestNGScreenshot {

	
	@Test
	public void amazonPage() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//Taka Screenshot
//		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
//		File src=edriver.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/Amazon_1.jpeg");
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
	}
}

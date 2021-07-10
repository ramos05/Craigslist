package craigslist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestSearchPrius {
       	
	
				
		@Test

	public void TestStartSearching() {  
		System.out.println("Starting Searching");
		
//		Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		maximize browser window
		driver.manage().window().maximize();
		
//		open the page
		String url = "https://tampa.craigslist.org/d/cars-trucks-by-owner/search/cto?s=120";
		driver.get(url);
		System.out.println("Page is opened");
		
		
//		enter searching Data
		WebElement searchField = driver.findElement(By.id("query"));
		searchField.sendKeys("Prius");
		sleep(2000);
		
		
//		click search button
		WebElement searchButton = driver.findElement(By.className("searchbtn"));
		searchButton.click();
		
		
		
//		klklklkl
		
		
//		Close browser
		driver.quit();
		
		
		}

		private void sleep(long m) {
			try {
				Thread.sleep(m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
		
		
		
		
	}



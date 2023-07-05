package Step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch_Steps {
	
	WebDriver driver = null;
	
	@Given("browser is opened")
	public void browser_is_opened() {
	    
		System.out.println("Inside ---> Browser is Opened ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\CUCUMBER CODES\\Cucumber_Examples\\src\\test\\resources\\drivers\\CD.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@And("user is on the google page")
	public void user_is_on_the_google_page() {
		
		System.out.println("Inside ---> User is on Google Page ");
	    driver.get("https://www.google.com");
	}

	@When("user enters the text on search box")
	public void user_enters_the_text_on_search_box() {
	   
		driver.findElement(By.id("APjFqb")).sendKeys("Zerodha Login");
	}

	@And("hits enter")
	public void hits_enter() {
		
	    driver.findElement(By.xpath("//div[@jsname='VlcLAe']/center/input[1]")).click();
	}

	@Then("naviagted to the result page")
	public void naviagted_to_the_result_page() {
	    
		driver.findElement(By.xpath("//div[@class='yuRUbf']/a/h3")).click();
		}
}

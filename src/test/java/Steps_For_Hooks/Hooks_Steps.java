package Steps_For_Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Steps {
	
	WebDriver driver = null;
	
	@Before(order=1)
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/CD.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize(); 
		
		System.out.println();
	}
	
	
	@Before (order=0)
	public void setup2() {
		System.out.println("I'm inside the SETUP 2");
	}
	
	@BeforeStep
	public  void beforeSteps() {
		
		System.out.println("I'm insidethe BEFORE STEPS FUNCTION");
		System.out.println();

	}
	
	@AfterStep
	public  void afterSteps() {
		
		System.out.println("I'm insidethe AFTER STEPS FUNCTION");
		System.out.println();

	}
	
	
	@Given("use is on the login page")
	public void use_is_on_the_login_page() {
	    
		System.out.println("I'm on the LOGIN PAGE ");
		System.out.println();

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
		System.out.println("I'm going to enter the credentials ");
		System.out.println();

	}

	@When("Clicks on the login button")
	public void clicks_on_the_login_button() {
		
		System.out.println("I'm going to click the LOGIN Button ");
		System.out.println();

	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
		System.out.println("Finally landed on the Page!!! ");
		System.out.println();

	}
	
	
	
	@After (order =1)
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@After (order=0)
	public void after2() {
		System.out.println("I'm inside the Teardown 2");
	}

}

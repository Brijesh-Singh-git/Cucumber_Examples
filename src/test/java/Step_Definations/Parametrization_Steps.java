package Step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametrization_Steps {
	
	
	WebDriver driver = null;

@Given("Website is opened using url")
public void website_is_opened() {
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\CUCUMBER CODES\\Cucumber_Examples\\src\\test\\resources\\drivers\\CD.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize(); 
	
	driver.get("https://example.testproject.io/web/");
}

@When("^user enters the (.*) and (.*)$")
public void user_enters_the_name_and_password(String name, String password) throws InterruptedException {
    
	driver.findElement(By.id("name")).sendKeys(name);
	driver.findElement(By.id("password")).sendKeys(password); 
	
	Thread.sleep(2000);
}

@Then("user clicks on the Login button")
public void user_clicks_on_the_Login_button() {
   driver.findElement(By.id("login")).click();
}


}

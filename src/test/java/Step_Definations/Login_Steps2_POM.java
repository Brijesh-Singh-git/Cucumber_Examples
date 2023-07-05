package Step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login_Steps2_POM {
	
	
	
	WebDriver driver = null;
	LoginPage l1;

@Given("Website is opened")
public void website_is_opened() {
    
	
	
	System.out.println("********I ma inside Login DEMO POM FILE ********");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\CUCUMBER CODES\\Cucumber_Examples\\src\\test\\resources\\drivers\\CD.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize(); 
	
	driver.get("https://example.testproject.io/web/");
}

@When("user enters the name and password")
public void user_enters_the_name_and_password(String username, String password) {
    
	LoginPage l1 = new LoginPage(driver);
	l1.enterName(username);
	l1.enterPasword(password);

}

@And("clicks on the login button")
public void clicks_on_the_login_button() {
  
	l1.clickLogin();
	
}

@And("then user selects the country")
public void then_user_selects_the_country() {
    l1.hoverCountry();
    l1.seleCountry();
    
}

@And("enters the address, email and contact number")
public void enters_the_address_email_and_contact_number() {
    l1.enterrAddress();
    l1.enterrEmail();
    l1.enterPhone();
    
    
}

@And("enters the save button")
public void enters_the_save_button() {
    l1.clickSave();
    
}

@Then("user clicks the Logout button")
public void user_clicks_the_Logout_button() {
 
	l1.clickLogout(); 
}


}

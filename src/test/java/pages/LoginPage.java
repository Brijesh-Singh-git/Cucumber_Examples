package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	By txt_username = By.id("name");
	By txt_pass = By.id("password");
	By txt_login = By.id("login");
	By txt_logout = By.id("logout");
	By txt_save = By.id("save");
	By txt_address = By.id("address");
	By txt_email = By.id("email");
	By txt_phone = By.id("phone");
	By txt_country = By.id("country");
	By txt_SelectCountry = By.xpath("//select[@id='country']/option[6]");

	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void enterName(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPasword(String password) {
		driver.findElement(txt_pass).sendKeys(password);
		
	}
	
	public void clickLogin() {
		driver.findElement(txt_login).click();
		
	}
	
	public void clickLogout() {
		driver.findElement(txt_logout).click();
		
	}
	
	public void clickSave() {
		driver.findElement(txt_save).click();
		
	}
	
	public void enterrAddress() {
		driver.findElement(txt_address).sendKeys("Near IMA, Premnager Dehradun, Uttarakhand" );
		
	}
	
	public void enterrEmail() {
		driver.findElement(txt_email).sendKeys("abchjsdhh@amazon.com" );
		
	}
	public void enterPhone() {
		driver.findElement(txt_phone).sendKeys("98896521477" );
		
	}
	
	public void hoverCountry() {
		driver.findElement(txt_country).click();
		
	}
	
	public void seleCountry() {
		driver.findElement(txt_SelectCountry).click();
		
	}
	
	
	
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys("Mohan Singh Rajput");
		driver.findElement(txt_pass).sendKeys("12345");
		driver.findElement(txt_login).click();
		driver.findElement(txt_logout).click();
		driver.findElement(txt_save).click();
		
		driver.findElement(txt_address).sendKeys("Near IMA, Premnager Dehradun, Uttarakhand" );
		driver.findElement(txt_email).sendKeys("abchjsdhh@amazon.com" );
		driver.findElement(txt_phone).sendKeys("98896521477" );
		driver.findElement(txt_country).click();
		driver.findElement(txt_SelectCountry).click();
		
		

	}
	
	
}

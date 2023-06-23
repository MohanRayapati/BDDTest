package TestDiligentPharma.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.FacebookLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDefs {
	
	WebDriver driver;
	
	@When("^Enter username \"([^\\\"]*)\" in username field$")
	public void enter_username_mohan_in_username_field(String user) {
		
		driver.findElement(By.name(FacebookLogin.username_editbox)).sendKeys(user);
	     
	}

	@Then("^Enter password \"([^\\\"]*)\" in password field$")
	public void enter_password_test1_in_password_field(String pass) {
		 driver.findElement(By.name(FacebookLogin.password_editbox)).sendKeys(pass);
	       
	}

	@Given("Login to facebook page")
	public void login_to_facebook_page() throws InterruptedException {
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(FacebookLogin.url);
	    Thread.sleep(FacebookLogin.wait);
	   
	}
	
	@Then("Click on Login button")
	public void click_on_login_button() {
		
		driver.findElement(By.name(FacebookLogin.login_btn)).click();
	}
	
	@And("Close the chrome browser")
	public void close_the_chrome_browser() {
	    driver.quit();	    
	    
	}
}

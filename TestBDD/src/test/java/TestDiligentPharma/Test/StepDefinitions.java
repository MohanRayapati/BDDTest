package TestDiligentPharma.Test;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearch;

public class StepDefinitions {
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();

	}

	@When("Open url in browser")
	public void open_url_in_browser() {
	    driver.get(GoogleSearch.url);
	    
	}

	@Then("Enter text in google search box")
	public void enter_text_in_google_search_box() throws InterruptedException {
	    driver.findElement(By.name(GoogleSearch.google_editbox)).sendKeys(GoogleSearch.input_text);
	    Thread.sleep(GoogleSearch.wait);
	    driver.findElement(By.name(GoogleSearch.google_search_btn)).click();
	    
	}

	@Then("Get the title and print")
	public void get_the_title_and_print() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}
	@And("Close the browser")
	public void close_the_browser() {
	    driver.quit();	    
	    
	}

}

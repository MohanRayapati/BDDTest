package PageMethods;

import ObjectRepo.GoogleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMethods {
	
	WebDriver driver;
	
	GoogleSearch g = new GoogleSearch();
	public void launch_the_url() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(GoogleSearch.url);

	}

	public void enter_text_in_google_search_box() throws InterruptedException {
	    driver.findElement(By.name(GoogleSearch.google_editbox)).sendKeys(GoogleSearch.input_text);
	    Thread.sleep(GoogleSearch.wait);
	    driver.findElement(By.name(GoogleSearch.google_search_btn)).click();
	    
	}

	public void get_the_title_and_print() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}
	
	public void close_the_browser() {
	    driver.quit();	    
	    
	}

}

package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {
	WebDriver driver;
	
	@Given("Lanuch the Browser")
	public void lanuch_the_browser() {
	   
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter the URL")
	public void enter_the_url() {
	    
		driver.get("http:localhost:8888");
		driver.manage().window().maximize();
	}

	@Then("Enter the UserName")
	public void enter_the_user_name() {
	    
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("Enter the Password")
	public void enter_the_password() {
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	}

	@Then("Click on Login Button")
	public void click_on_login_button() {
	    
		driver.findElement(By.id("submitbutton")).click();
	}

	@Then("Close the Browser")
	public void close_the_browser() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	@Given("Enter the URL {string}")
	public void enter_the_url(String URL) {
	    
		driver.get(URL);
	}

	@Then("Enter the UserName {string}")
	public void enter_the_user_name(String UN) {
	    
		driver.findElement(By.name("user_name")).sendKeys(UN);
	}

	@Then("Enter the Password {string}")
	public void enter_the_password(String PWD) {
	    
		driver.findElement(By.name("user_password")).sendKeys(PWD);
	}
	
	
	
	@Then("Get Current Page Title {string}")
	public void get_current_page_title(String pgTitle) {
	    
		//Assert.assertTrue(true);
		String title = driver.getTitle();
		if(title.equals(pgTitle))
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("InValid user");
		}
	}
	

}

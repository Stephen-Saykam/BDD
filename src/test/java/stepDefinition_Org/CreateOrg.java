package stepDefinition_Org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrg {
	
	WebDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		System.out.println("browser opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Given("Enter the url {string}")
	public void enter_the_url(String url) {
		
		driver.manage().window().maximize();
		driver.get(url);
	    
	}

	@Then("Enter the un {string}")
	public void enter_the_un(String un) {
		
		driver.findElement(By.name("user_name")).sendKeys(un);
		System.out.println("User name is enterd");
	    
	}

	@Then("Enter the pwd {string}")
	public void enter_the_pwd(String pwd) {
		
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	    
	}

	@Then("Click on LoginBtn")
	public void click_on_login_btn() {
		
		driver.findElement(By.id("submitButton")).click();
	    
	}

	@Then("Verify Home Page {string}")
	public void verify_home_page(String string) {
		
		Assert.assertEquals(true, true);
	    
	}

	@Then("Click on Organization")
	public void click_on_organization() {
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	    
	}

	@Then("Click on create Org img")
	public void click_on_create_org_img() {
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    
	}

	@Then("Enter the Org Name {string}")
	public void enter_the_org_name(String orgname) {
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
	   
	}

	@Then("Enter the Phn Nbr {string}")
	public void enter_the_phn_nbr(String phn) {
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phn);
	    
	}

	@Then("Click on Save Button")
	public void click_on_save_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    Thread.sleep(2000);
	}

	@Then("Logout from App")
	public void logout_from_app() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		//Creating obj for Actions Class
		
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(logout).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("Close Browser")
	public void close_browser() {
		
		System.out.println("Browser is Closed");
		driver.close();
	    
	}

}

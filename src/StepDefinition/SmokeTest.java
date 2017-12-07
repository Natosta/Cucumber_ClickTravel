package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest 
{
	    
WebDriver driver;	
 

@Given("^I a user with valid credentials$")
public void i_a_user_with_valid_credentials() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDrive\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://apps-preview.uat.travel.cloud");
  
}

@When("^I enter my valid username and valid password$")
public void i_enter_my_valid_username_and_valid_password() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("qualityassurance@clicktravel.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing123");
   
}

@And("^I click on the login button$")
public void i_click_on_the_login_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-success btn-block btn-lg']")).click();

}

@Then("^I should be able to view the dashboard$")
public void i_should_be_able_to_view_the_dashboard() throws Throwable {
	 if(driver.getCurrentUrl().equalsIgnoreCase("https://apps-preview.uat.travel.cloud/#/"))
     {
         System.out.println("This is not the home screen Please check");
     }else{
    	 System.out.println("This is the home screen you can now view the dashboard!");
     }

}

















 }


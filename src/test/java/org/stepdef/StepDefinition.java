package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	@Given("user is on facebook page on chrome browser")
	public void user_is_on_facebook_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("abdulr18255523mail.com");
	    driver.findElement(By.id("pass")).sendKeys("abdulr");
	}

	@When("^click login button$")
	public void click_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("^user should check home page invissible or not$")
	public void user_should_check_home_page_invissible_or_not()  {
	   System.out.println("invalid");
	}


}

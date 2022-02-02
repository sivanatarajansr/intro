package org.stepdef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^user is on adactin login page on chrome browser$")
	public void user_is_on_adactin_login_page_on_chrome_browser()   {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://adactinhotelapp.com/");
	   
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2)  {
		driver.findElement(By.id("username")).sendKeys( arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	    
	}

	@When("^click login button$")
	public void click_login_button()  {
		driver.findElement(By.id("login")).click();
	    
	}

	@When("^user enter  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws InterruptedException  {
		WebElement ele1 = driver.findElement(By.id("location"));
		Select select1=new Select(ele1);
		select1.selectByVisibleText(arg1);
		WebElement ele2 = driver.findElement(By.id("hotels"));
		Select select2=new Select(ele2);
		select2.selectByVisibleText(arg2);
		WebElement ele3 = driver.findElement(By.id("room_type"));
		Select select3=new Select(ele3);
		select3.selectByVisibleText(arg3);
		WebElement ele4 = driver.findElement(By.id("room_nos"));
		Select select4=new Select(ele4);
		select4.selectByVisibleText(arg4);
		driver.findElement(By.id("datepick_in")).sendKeys(arg5);
		driver.findElement(By.id("datepick_out")).sendKeys(arg6);
		WebElement ele7 = driver.findElement(By.id("adult_room"));
		Select select7=new Select(ele7);
		select7.selectByVisibleText(arg7);
		WebElement ele8 = driver.findElement(By.id("child_room"));
		Select select8=new Select(ele8);
		select8.selectByVisibleText(arg8);
		
	}

	@When("^click search button$")
	public void click_search_button()  {
		driver.findElement(By.name("Submit")).click();
	    
	}

	@When("^user select hotel$")
	public void user_select_hotel()  {
		driver.findElement(By.id("radiobutton_0")).click();
		
	    
	}

	@When("^click continue button$")
	public void click_continue_button()  {
		driver.findElement(By.id("continue")).click();
	}

	@When("^user enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8)  {
		
		driver.findElement(By.id("first_name")).sendKeys(arg1);
		driver.findElement(By.name("last_name")).sendKeys(arg2);
		driver.findElement(By.id("address")).sendKeys(arg3);
		driver.findElement(By.id("cc_num")).sendKeys(arg4);
		WebElement ele5 = driver.findElement(By.id("cc_type"));
		Select select5=new Select(ele5);
		select5.selectByVisibleText(arg5);
		WebElement ele6 = driver.findElement(By.id("cc_exp_month"));
		Select select6=new Select(ele6);
		select6.selectByVisibleText(arg6);
		WebElement ele7 = driver.findElement(By.id("cc_exp_year"));
		Select select7=new Select(ele7);
		select7.selectByVisibleText(arg7);
		driver.findElement(By.id("cc_cvv")).sendKeys(arg8);
		
		
		
		
	    
	}

	@When("^click booknow$")
	public void click_booknow() throws InterruptedException  {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(7000);
	    
	}

	@Then("^order no is generated$")
	public void order_no_is_generated()  {
		WebElement ele = driver.findElement(By.xpath("(//input[contains(@class,'disable_text')])[15]"));
		String attribute = ele.getAttribute("value");
		System.out.println(attribute);
	
	}



}

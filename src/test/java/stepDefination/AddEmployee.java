package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployee {
	
	String beforeeid="";
	String aftereid="";

	WebDriver driver;
	@Given("^User navigates Url \"([^\"]*)\"$")
	public void user_navigates_Url(String url) throws Throwable {
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    throw new PendingException();
	}

	@When("^user log as username \"([^\"]*)\" and log as password \"([^\"]*)\"$")
	public void user_log_as_username_and_log_as_password(String user, String pass) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(user);
	    driver.findElement(By.name("txtPassword")).sendKeys(pass);
		
	    throw new PendingException();
	}

	@When("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    
	}

	@When("^user click on pim button$")
	public void user_click_on_pim_button()  {
	    
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

	    
	}

	@When("^user click  button$")
	public void user_click_button()  {
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	    throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String fname, String mname, String lname)  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(mname);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);


	    
	}

	@When("^user capture emid$")
	public void user_capture_emid() throws Throwable {
	    
		beforeeid=driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		
	    
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	    
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    
	}

	@When("^user capture emid after save$")
	public void user_capture_emid_after_save() throws Throwable {
	    
		aftereid=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");

	    
	}

	@Then("^user valid emid$")
	public void user_valid_emid() throws Throwable {
	    
		if(beforeeid.equalsIgnoreCase(aftereid))
		{
			System.out.println("Emp Added susses::"+beforeeid+"  "+aftereid);
		}
		else
			
		{
			System.out.println("Emp Added failed::"+beforeeid+"  "+aftereid);
		}
			
			
		
		
	    
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    
		
		driver.close();
	    
	}



}

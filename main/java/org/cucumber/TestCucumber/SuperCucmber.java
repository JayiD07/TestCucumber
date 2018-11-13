package org.cucumber.TestCucumber;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuperCucmber {
	static WebDriver driver;
	@Given("^The user is in guru login page$")
	public void the_user_is_in_guru_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\KS\\Desktop\\Jayi\\TestCucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/index.php");
	}

	@When("^The user enters valid user name and password$")
	public void the_user_enters_valid_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("uid")).sendKeys("mngr162617");
	    driver.findElement(By.name("password")).sendKeys("myhAnUb");
	}

	@When("^The user clicks th esubmit button$")
	public void the_user_clicks_th_esubmit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^The user should be in managers home page$")
	public void the_user_should_be_in_managers_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.getCurrentUrl().contains("guru99"));	}
}

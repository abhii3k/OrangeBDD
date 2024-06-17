package Stepdefination_OR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.OrangeElemnt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OrangeloginSteps {
	
	static WebDriver driver;
	OrangeElemnt Ele;
	

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("user enter  {string} and {string}")
	public void user_enter_and(String user, String pass) {
		
		Ele=new OrangeElemnt(driver);

	    Ele.Username(user);
	    Ele.Password(pass);

	}

	@Then("click on login")
	public void click_on_login() {

	Ele.Login();
	}

	@And("Landed to home page")
	public void landed_to_home_page() {

		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
	}

	@And("close browser")
	public void close_browser() {
		driver.close();
	}

	@And("Not Landed to home page")
	public void not_landed_to_home_page() {

		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed());

	}

	@Then("Click on admin tab")
	public void click_on_admin_tab() {
		
     Ele.Admin();
	}

	@Then("click on Add button")
	public void click_on_add_button() {
		
		 Ele.Add();
	}

	@Then("fill user details")
	public void fill_user_details() {

		Ele.User();
		Ele.save();

	}

	@Then("check radio button on user enter")
	public void check_radio_button_on_user_enter() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Ele.Radio();
	}

	@Then("check and click on delete button appear")
	public void check_and_click_on_delete_button_appear() throws InterruptedException {

		Ele.Delete();

	}

	@Then("handle alert")
	public void handle_alert() {

		Ele.PopUp();
	}

	@Then("click on profile button then logout")
	public void click_on_profile_button_then_logout() {

		Ele.Logout();

	}

}

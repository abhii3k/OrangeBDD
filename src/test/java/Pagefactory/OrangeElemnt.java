package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeElemnt {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement Uname;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement Admintab;

	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement addbtn;

	@FindBy(xpath = "//label[text()='User Role']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//div[@class='oxd-select-wrapper']")
	WebElement UserRolebtn;

	@FindBy(xpath = "(//div[@role='listbox']//child::div)[3]")
	WebElement userOption;

	@FindBy(xpath = "(//div[@role='listbox']//child::div)[2]")
	WebElement userOption2;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement Autonamebtn;

	@FindBy(xpath = "//label[text()='Status']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//div[@class='oxd-select-wrapper']")
	WebElement statusbtn;

	@FindBy(xpath = "//label[text()='Username']//parent::div[@class='oxd-input-group__label-wrapper']//parent::div//input")
	WebElement userbtn;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement pass1;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement pass2;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebtn;

	@FindBy(xpath = "//div[text()='Sham1235']//parent::div//parent::div//div[@class='oxd-table-card-cell-checkbox']")
	WebElement checkbtn;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")
	WebElement Deletebtn;

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	WebElement delPopbtn;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	WebElement Prfbtn;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logoutbtn;

//*********************Methods to access Elements***************************************

	public OrangeElemnt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Username(String user) {

		Uname.click();
		Uname.sendKeys(user);
	}

	public void Password(String pa) {

		pass.click();
		pass.sendKeys(pa);

	}

	public void Login() {

		loginbtn.click();

	}

	public void Admin() {

		Admintab.click();

	}

	public void Add() {

		addbtn.click();

	}

	public void User() {

		UserRolebtn.click();
		userOption.click();

		Autonamebtn.click();
		Autonamebtn.sendKeys("r");
		userOption.click();

		statusbtn.click();
		userOption2.click();

		userbtn.click();
		userbtn.sendKeys("Sham1235");

		pass1.click();
		pass1.sendKeys("Pass1234567");

		pass2.click();
		pass2.sendKeys("Pass1234567");

	}

	public void save() {

		savebtn.click();

	}

	public void Radio() {

		checkbtn.click();

	}

	public void Delete() throws InterruptedException {

		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Deletebtn)).click();

	}

	public void PopUp() {

		delPopbtn.click();

	}

	public void Logout() {

		Prfbtn.click();
		Logoutbtn.click();

	}

}

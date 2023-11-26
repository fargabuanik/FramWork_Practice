package practice.ny.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	WebDriver driver;

	@Given("Use is able to open any browser")
	public void use_is_able_to_open_any_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("user is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");

	}

	@Given("user is able to enter the user first name")
	public void user_is_able_to_enter_the_user_first_name() {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Fargab");

	}

	@Given("user is able to enter the user last name")
	public void user_is_able_to_enter_the_user_last_name() {
		driver.findElement(By.xpath(" //input[@id='surname']")).sendKeys("Anik");

	}

	@Given("user is able to enter the Age")
	public void user_is_able_to_enter_the_age() {
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("50");

	}

	@Given("user is able to enter the Notes number")
	public void user_is_able_to_enter_the_notes_number() {
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("HTTP");

	}

	@Given("user is able to click on Submit button")
	public void user_is_able_to_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();

	}

}

package Defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUS_Steps {
	
	WebDriver driver;

	@Given("Open browser , enter the URL of Sparsh Hospital")
	public void open_browser_enter_the_url_of_sparsh_hospital() {
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.sparshhospital.com/");
	

	}

	@Given("Click on the ContactUS link")
	public void click_on_the_contact_us_link() {
		
		driver.findElement(By.linkText("Contact Us")).click();
	}

	@When("User enter firstname , lastname , phone number , email textbox")
	public void user_enter_firstname_lastname_phone_number_email_textbox() {
		
		//Enter Firstname
				driver.findElement(By.xpath("//*[@name='contact_first_name']")).sendKeys("Goutam");
				
				//Enter Lastname
				driver.findElement(By.xpath("//*[@name='contact_last_name']")).sendKeys("Gurjar");
				
				//Enter Mobile Number
				driver.findElement(By.xpath("//*[@name='contact_phone']")).sendKeys("98268123455");
				
				//enter Email ID
				driver.findElement(By.xpath("//*[@name='contact_email']")).sendKeys("gm1234@gmail.com");
				
	}

	@When("Select Yashwantpur Hospital from hospitak dropdown and select enquiry")
	public void select_yashwantpur_hospital_from_hospitak_dropdown_and_select_enquiry() {
		
		//Select Hospital in the dropdown
		
		WebElement dropdown = driver.findElement(By.cssSelector("[id=\"contact_hospital\"]"));
		
		Select se = new Select(dropdown);
		
		se.selectByValue("SPARSH Hospital, Yeswanthpur");
		
		//Select the Enquiry
		WebElement enquiry = driver.findElement(By.cssSelector("[id=\"contact_enquiry_type\"]"));
		
		Select s = new Select(enquiry);
		
		s.selectByValue("Feedback");
	}

	@When("Write a meeasge and click on send button")
	public void write_a_meeasge_and_click_on_send_button() throws InterruptedException {
		
		// GIve a message
		driver.findElement(By.xpath("//*[@id=\"contact_message\"]")).sendKeys("Hospital is very good...!");
		
		Thread.sleep(2000);
		//click on Send button
		driver.findElement(By.xpath("//*[@id=\"contact_submit\"]")).click();
	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {
		
		String actualTitle  = driver.findElement(By.xpath("(//*[@class=\"font-700 mb-4\"])[1]")).getText();
		
		String expectedTitle = "Thank you";
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("Bank info should be available in the page")
	public void bank_info_should_be_available_in_the_page() {
		
		String actualTitle  = driver.findElement(By.xpath("(//*[@class=\"font-700 mb-4\"])[2]")).getText();
		
		String expectedTitle = "Join Hands for Healing Lives!";
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@When("User enter {string} , {string} , {string} , {string} textbox")
	public void user_enter_textbox(String firstname, String lastname, String phone , String email) {
		
		//Enter Firstname
		driver.findElement(By.xpath("//*[@name='contact_first_name']")).sendKeys(firstname);
		
		//Enter Lastname
		driver.findElement(By.xpath("//*[@name='contact_last_name']")).sendKeys(lastname);
		
		//Enter Mobile Number
		driver.findElement(By.xpath("//*[@name='contact_phone']")).sendKeys(phone);
		
		//enter Email ID
		driver.findElement(By.xpath("//*[@name='contact_email']")).sendKeys(email);

	}
}

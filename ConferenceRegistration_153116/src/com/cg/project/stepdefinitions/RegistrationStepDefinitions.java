package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.MakePayment;
import com.cg.project.beans.RoomBooking;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistrationStepDefinitions {
	private WebDriver driver;
	private RoomBooking roomBooking;
	private MakePayment make;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	
	@Given("^User is on Conference room booking page$")
	public void user_is_on_Conference_room_booking_page() throws Throwable {
	     
		driver = new ChromeDriver();
		driver.get( "D:\\Practice\\Cucumber\\ConferenceRegistration_153116\\ConferenceRegistartion.html" );
		driver.manage().window().maximize();
		roomBooking= new RoomBooking();
		PageFactory.initElements(driver, roomBooking);
		roomBooking.clickNextPageLink();
		
	}

	@When("^select 'Next' link without entering 'FirstName'$")
	public void select_Next_link_without_entering_FirstName() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the First Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setFirstName("Deepika");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Last Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setLastName("Korrapati");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Email";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please fill the Email message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setEmail("devika.thiraivanan capgemini.com");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering invalid 'Email' address$")
	public void user_select_Next_link_after_entering_invalid_Email_address() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Email Id.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please enter valid Email Id\\. message should display$")
	public void please_enter_valid_Email_Id_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setEmail(" deepika.korrapati@capgemini.com");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'Contact No'$")
	public void user_select_Next_link_without_entering_Contact_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Contact No.";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please fill the Contact No message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setContactNo("15423");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering invalid 'Contact No'$")
	public void user_select_Next_link_after_entering_invalid_Contact_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Contact no.";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please enter valid Contact no message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setContactNo("9930856957");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'Number of people attending'$")
	public void user_select_Next_link_without_selecting_Number_of_people_attending() throws Throwable {
	
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Number of people attending";
		Assert.assertEquals(expectedMessage, actualMessage);
	
	}

	@Then("^'Please fill the Number of people attending' message should display$")
	public void please_fill_the_Number_of_people_attending_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setNoOfPerson("3");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without entereing  'Building Name & Room No'$")
	public void user_select_Next_link_without_entereing_Building_Name_Room_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Building & Room No";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Building & Room No' message should display$")
	public void please_fill_the_Building_Room_No_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setBuildingAndRoomNo("No.12,GopalStreet");
		roomBooking.clickNextPageLink(); 
	}

	@When("^User select 'Next' link without entereing  'Area Name'$")
	public void user_select_Next_link_without_entereing_Area_Name() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Area name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Area name' message should display$")
	public void please_fill_the_Area_name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setAreaName("SatyaGarden,Saligramam");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'City'$")
	public void user_select_Next_link_without_selecting_City() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select city";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setCity("Pune");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'State'$")
	public void user_select_Next_link_without_selecting_State() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select state";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		roomBooking.setState("Maharashtra");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'MemberShip Status '$")
	public void user_select_Next_link_without_selecting_MemberShip_Status() throws Throwable {
		
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please Select MemeberShip status";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please Select MemeberShip status' message should display$")
	public void please_Select_MemeberShip_status_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		roomBooking.setMemberStatus("member");
		roomBooking.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable {
		
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Personal details are validated.";
		Assert.assertEquals(expectedMessage, actualMessage);
	
	}
/*
	@Then("^'Personal details are validated' message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
		
		roomBooking.setFirstName("Deepika");
		roomBooking.setLastName("Korrapati");
		roomBooking.setEmail("deepika.korrapati@capgemini.com");
		roomBooking.setContactNo("9930856957");
		roomBooking.setNoOfPerson("3");
		roomBooking.setBuildingAndRoomNo("No.12,GopalStreet");
		roomBooking.setAreaName("SatyaGarden,Saligramam");
		roomBooking.setCity("Pune");
		roomBooking.setState("Maharashtra");
		roomBooking.setMemberStatus("member");
		roomBooking.clickNextPageLink();
		roomBooking.clickNextPageLink();
		driver.switchTo().alert().dismiss();
	}
	
*/


@When("^User select 'MakePayment' button without entering 'CardHolderName'$")
public void user_select_MakePayment_button_without_entering_CardHolderName() throws Throwable {
	//roomBooking.clickNextPageLink(); 
	Alert jsAlert = driver.switchTo().alert();
	if(jsAlert.getText().equals("Personal details are validated."))
	{
		Thread.sleep(1000);
		jsAlert.accept();
		driver.navigate().to("D:\\Practice\\Cucumber\\ConferenceRegistration_153116\\PaymentDetails.html");
		driver.manage().window().maximize();
		make = PageFactory.initElements(driver, MakePayment.class);
	}
	else
	{
		
	}
	make.clickMakePaymentButton();

}

@Then("^'Please fill the CardHolderName' message should display$")
public void please_fill_the_CardHolderName_message_should_display() throws Throwable {
	
	 String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Card holder name";
		Assert.assertEquals(expectedMessage, actualMessage);
	
}

@When("^User select 'MakePayment' button without entering 'DebitCardNumber'$")
public void user_select_MakePayment_button_without_entering_DebitCardNumber() throws Throwable {
	driver.switchTo().alert().dismiss();
	 
	make.setCardHolderName("Deepika");;
	make.clickMakePaymentButton();
	String actualMessage=driver.switchTo().alert().getText();
	String expectedMessage="Please fill the Debit card Number";
	Assert.assertEquals(expectedMessage, actualMessage);
}

@Then("^'Please fill the Debit Card Number' message should display$")
public void please_fill_the_Debit_Card_Number_message_should_display() throws Throwable {
	driver.switchTo().alert().dismiss();
	 
	make.setDebitCardNumber("1234567890");
	make.clickMakePaymentButton();
}

@When("^User select 'MakePayment' button without entering 'CVV'$")
public void user_select_MakePayment_button_without_entering_CVV() throws Throwable {
	String actualMessage=driver.switchTo().alert().getText();
	String expectedMessage="Please fill the CVV";
	Assert.assertEquals(expectedMessage, actualMessage);
}

@Then("^'Please fill the CVV message should display$")
public void please_fill_the_CVV_message_should_display() throws Throwable {
	driver.switchTo().alert().dismiss();
	 
	make.setCvv("123");
	make.clickMakePaymentButton();
}

@When("^User select 'MakePayment' button without entering 'ExpirationMonth'$")
public void user_select_MakePayment_button_without_entering_ExpirationMonth() throws Throwable {
	String actualMessage=driver.switchTo().alert().getText();
	String expectedMessage="Please fill expiration month";
	Assert.assertEquals(expectedMessage, actualMessage);
}

@Then("^'Please fill Expiration Month' message should display$")
public void please_fill_Expiration_Month_message_should_display() throws Throwable {
	driver.switchTo().alert().dismiss();
	 
	make.setExpirationMonth("12");
	make.clickMakePaymentButton();
}

@When("^User select 'MakePayment' button without entering 'ExpirationYear'$")
public void user_select_MakePayment_button_without_entering_ExpirationYear() throws Throwable {
	String actualMessage=driver.switchTo().alert().getText();
	String expectedMessage="Please fill the expiration year";
	Assert.assertEquals(expectedMessage, actualMessage);
}

@Then("^'Please enter ExpirationYear'message should display$")
public void please_enter_ExpirationYear_message_should_display() throws Throwable {
	driver.switchTo().alert().dismiss();
	 
	make.setExpirationYear("2022");
	
}

@When("^User select 'MakePayment' button after entering Valid set of information$")
public void user_select_MakePayment_button_after_entering_Valid_set_of_information() throws Throwable {
	make.clickMakePaymentButton();
	
}

@Then("^'Conference Room Booking successfully done!!!' message should display$")
public void conference_Room_Booking_successfully_done_message_should_display() throws Throwable {
	String actualMessage=driver.switchTo().alert().getText();
	String expectedMessage="Conference Room Booking successfully done!!!";
	Assert.assertEquals(expectedMessage, actualMessage);
}

@Then("^close browser window$")
public void close_browser_window() throws Throwable {
  
}
	
}

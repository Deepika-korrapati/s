package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakePayment {
	@FindBy(how=How.ID,id="txtCardholderName")
	private WebElement cardHolderName;
	
	@FindBy(how=How.ID,id="txtDebit")
	private WebElement debitCardNumber;
	
	@FindBy(how=How.ID,id="txtCvv")
	private WebElement cvv;
	
	@FindBy(how=How.ID,id="txtMonth")
	private WebElement expirationMonth;
	
	@FindBy(how=How.ID,id="txtYear")
	private WebElement expirationYear;
	
	@FindBy(how=How.ID,id="btnPayment")
	private WebElement makePayment;
	
	
	public void clickMakePaymentButton() {
		makePayment.click();
	}
	public String getCardHolderName() {
		return cardHolderName.getAttribute("value");
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}

	public String getDebitCardNumber() {
		return debitCardNumber.getAttribute("value");
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber.sendKeys(debitCardNumber);;
	}

	public String getCvv() {
		return cvv.getAttribute("value");
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);;
	}

	public String getExpirationMonth() {
		return expirationMonth.getAttribute("value");
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth.sendKeys(expirationMonth);;
	}

	public String getExpirationYear() {
		return expirationYear.getAttribute("value");
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear.sendKeys(expirationYear);
	}
}

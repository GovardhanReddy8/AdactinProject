package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstname;

	public void firstname(String fname) {
		firstname.sendKeys(fname);

	}

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	public void lastName(String lname) {
		lastName.sendKeys(lname);

	}

	@FindBy(xpath = "//input[@name='address']")
	WebElement address;

	public void address(String addrs) {
		address.sendKeys(addrs);

	}

	@FindBy(xpath = "//input[@name='cc_num']")
	WebElement ccnumber;

	public void ccnumber(String cardno) {
		ccnumber.sendKeys(cardno);

	}

	@FindBy(xpath = "//select[@name='cc_type']")
	WebElement cctype;

	public void cctype() {
		new Select(cctype).selectByIndex(1);

	}

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	WebElement ccmonth;

	public void ccmonth() {
		new Select(ccmonth).selectByIndex(8);

	}

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	WebElement ccyear;

	public void ccyear() {
		new Select(ccyear).selectByIndex(11);

	}

	@FindBy(xpath = "//input[@name='cc_cvv']")
	WebElement cvvno;

	public void cvvno(String cno) {
		cvvno.sendKeys(cno);

	}

	@FindBy(xpath = "//input[@name='book_now']")
	WebElement button;

	public void button() {
		button.click();

	}

}

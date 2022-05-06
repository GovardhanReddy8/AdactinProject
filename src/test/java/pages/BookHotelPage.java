package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage {
	public BookHotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstname;

	public void firstname(String firname) {
		new Select(firstname).selectByVisibleText(firname);

	}

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	public void lastName(String lname) {
		new Select(lastName).selectByVisibleText(lname);

	}

	@FindBy(xpath = "//input[@name='address']")
	WebElement address;

	public void address(String addrs) {
		new Select(address).selectByVisibleText(addrs);

	}

	@FindBy(xpath = "//input[@name='cc_num']")
	WebElement ccnumber;

	public void ccnumber(String cardno) {
		new Select(ccnumber).selectByVisibleText(cardno);

	}

	@FindBy(xpath = "//select[@name='cc_type']")
	WebElement cctype;

	public void cctype(String cardtype) {
		new Select(cctype).selectByVisibleText(cardtype);

	}

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	WebElement ccmonth;

	public void ccmonth(String cardmonth) {
		new Select(ccmonth).selectByVisibleText(cardmonth);

	}

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	WebElement ccyear;

	public void ccyear(String cardyear) {
		new Select(ccyear).selectByVisibleText(cardyear);

	}

	@FindBy(xpath = "//input[@name='cc_cvv']")
	WebElement cvvno;

	public void cvvno(String cno) {
		new Select(cvvno).selectByVisibleText(cno);

	}

	@FindBy(xpath = "//input[@name='book_now']")
	WebElement bookNow;

	public void button() {
		bookNow.click();

	}

}

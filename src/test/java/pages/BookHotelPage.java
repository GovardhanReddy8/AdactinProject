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

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;

	public void firstname(String firname) {
		firstname.sendKeys(firname);

	}

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;

	public void lastName(String lname) {
		lastName.sendKeys(lname);

	}

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement address;

	public void address(String addrs) {
		address.sendKeys(addrs);

	}

	@FindBy(xpath = "//input[@id='cc_num']")
	WebElement ccnumber;

	public void ccnumber(String cardno) {
		ccnumber.sendKeys(cardno);

	}

	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement cctype;

	public void cctype(String cardtype) {
		new Select(cctype).selectByVisibleText(cardtype);

	}

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	WebElement ccmonth;

	public void ccmonth(String cardmonth) {
		new Select(ccmonth).selectByVisibleText(cardmonth);

	}

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	WebElement ccyear;

	public void ccyear(String cardyear) {
		new Select(ccyear).selectByVisibleText(cardyear);

	}

	@FindBy(xpath = "//input[@id='cc_cvv']")
	WebElement cvvno;

	public void cvvno(String cno) {
		cvvno.sendKeys(cno);

	}

	@FindBy(xpath = "//input[@id='book_now']")
	WebElement bookNow;

	public void bookNow() {
		bookNow.click();

	}

}

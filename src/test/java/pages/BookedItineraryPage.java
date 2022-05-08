package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {
	public BookedItineraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='ids[]']")
	WebElement selectOne;

	public void selectOne(String orderId) {
		selectOne.sendKeys(orderId);
		System.out.println(selectOne);

	}

	@FindBy(xpath = "//input[@name='cancelall']")
	WebElement cancel;

	public void cancel() {
		cancel.click();

	}

	@FindBy(xpath = "//input[@name='logout']")
	WebElement logOut;

	public void logOut() {
		logOut.click();
	}

	@FindBy(xpath = "//input[@name='search_hotel']")
	WebElement searchAgain;

	public void searchAgain() {
		searchAgain.click();

	}
}

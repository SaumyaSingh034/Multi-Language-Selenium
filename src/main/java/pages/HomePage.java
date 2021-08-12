package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtility;

public class HomePage {

	private WebDriver driver;
	private ElementUtility elem;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		elem = new ElementUtility(driver);
	}

	private WebElement getHeaderElement(String headerValue) {
		String HeaderXpath = "//a[contains(text(),'" + headerValue + "')]";
		return elem.getElement("xpath", HeaderXpath);
	}

	public boolean isHeaderExist(String headerValue) {
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		return getHeaderElement(headerValue).isDisplayed();
	}

	private WebElement getContactElement(String containDetails) {
		String contactXpath = "//a[contains(text(),'" + containDetails + "')]";

		return elem.getElement(contactXpath, containDetails);
	}

	public boolean isContactExist(String containDetails)

	{
		String contact = getContactElement(containDetails).getText();
		System.out.println(contact);
		return getContactElement(containDetails).isDisplayed();

	}
}

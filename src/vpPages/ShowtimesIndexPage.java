package vpPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;


public class ShowtimesIndexPage extends PageObject {
	
	public ShowtimesIndexPage(WebDriver driver) {
		 super(driver);
		 driver.get("https://v2lp.herokuapp.com/showtimes");
		
		if (!"https://v2lp.herokuapp.com/showtimes".equals(driver.getCurrentUrl())) {
                    throw new IllegalStateException("This is not the showtimes index page");
       		}
	}


	@FindBy(tagName = "h2")
	private WebElement header;
	
	public String confirmationHeader(){
		return this.header.getText();
	}
}



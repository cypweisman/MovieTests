package vpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;


public class CreateMoviePage extends PageObject {
	
	public CreateMoviePage(WebDriver driver) {
		 super(driver);
		 driver.get("https://v2lp.herokuapp.com/movies/new");
		
		if (!"https://v2lp.herokuapp.com/movies/new".equals(driver.getCurrentUrl())) {
            	    throw new IllegalStateException("This is not the create movie page");
        	}
	}
	
	
	@FindBy(id="movie_title")
	private WebElement movieTitle;
	
	@FindBy(id="movie_runtime")
	private WebElement movieRuntime;
	
	@FindBy(name="commit")
	private WebElement submitButton;
	
	
	
	public void enterMovieTitle(String movietitle) {
		this.movieTitle.sendKeys(movietitle);
	}
	
	public void enterMovieRuntime(int i) {
		this.movieRuntime.sendKeys(String.valueOf(i));
	}
	
	public ShowtimesIndexPage submitMovie(){
		submitButton.click();
		return new ShowtimesIndexPage(driver);
	}
	
	public ShowtimesIndexPage createMovie(String movietitle, int i){
		this.movieTitle.sendKeys(movietitle);
		this.movieRuntime.sendKeys(String.valueOf(i));
		submitButton.click();
		return new ShowtimesIndexPage(driver);
	}
	
}



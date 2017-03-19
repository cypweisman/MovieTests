package vpPagesTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import vpPages.CreateMoviePage;
import vpPages.ShowtimesIndexPage;


public class CreateMovieFormTest extends FuncTest {
	
	@Test
	public void createMovieAsValid() {
		
		CreateMoviePage createMoviePage = new CreateMoviePage(driver);
		ShowtimesIndexPage showtimesIndexPage;
		
//		createMoviePage.enterMovieTitle("Safety Save");
//		createMoviePage.enterMovieRuntime(90);
//		ShowtimesIndexPage showtimesIndexPage = createMoviePage.submitMovie();
		
		showtimesIndexPage = createMoviePage.createMovie("Safety Save", 90);
		assertEquals("All Showtimes", showtimesIndexPage.confirmationHeader());
		
		
	}

}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class IAmTheDriver {
	public static void main(String... args){
	
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
		IAmTheEventListener eventListener = new IAmTheEventListener();
		eventFiringDriver.register(eventListener);
	
		eventFiringDriver.get("http://www.kaffee-netz.com");
		eventFiringDriver.get("http://www.github.com");
		
		eventFiringDriver.navigate().back();
		eventFiringDriver.quit();
		
		
	}

}
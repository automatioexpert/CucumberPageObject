package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	
	@FindBy(how=How.LINK_TEXT,using ="Cars")
	public WebElement carsForSaleLink1;
	
	@FindBy(how=How.ID,using ="Cars")
	public WebElement carsForSaleLink2;
	
	@FindBy(how=How.XPATH,using ="Cars")
	public WebElement carsForSaleLink3;
	
	@FindBy(how=How.CSS,using ="Cars")
	public WebElement carsForSaleLink4;
	
	@FindBy(how=How.NAME,using ="Cars")
	public WebElement carsForSaleLink5;
	
	@FindBy(how=How.TAG_NAME,using ="Cars")
	public WebElement carsForSaleLink6;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using ="Cars")
	public WebElement carsForSaleLink7;
	
	@FindBy(how=How.CLASS_NAME,using ="Cars")
	public WebElement carsForSaleLink8;
	
}

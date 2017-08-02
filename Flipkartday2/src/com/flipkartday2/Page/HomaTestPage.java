package com.flipkartday2.Page;




import org.hamcrest.Matchers;
import org.openqa.selenium.interactions.Actions;


import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class HomaTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.link.menu")
	private QAFWebElement homepageLinkMenu;
	@FindBy(locator = "homepage.link.submenu")
	private QAFWebElement homepageLinkSubmenu;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomepageLinkMenu() {
		return homepageLinkMenu;
	}

	public QAFWebElement getHomepageLinkSubmenu() {
		return homepageLinkSubmenu;
	}
	public void selectCategory(String menuname,String submenu)
	{
		QAFExtendedWebElement menuButton=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("homepage.link.menu"),"Electronics"));
	    Actions action=new Actions(driver);
	    action.moveToElement(menuButton).perform();
	    QAFExtendedWebElement subcategory=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("homepage.link.submenu"),"Apple"));
	    subcategory.waitForVisible();
	      subcategory.click();
	}
	public void launchsite()
	{
		driver.get("/");
	}
	public void verifyFlipKartHomePage() {
		Validator.verifyThat("flipkarthomepage should display properly",driver.getTitle(), Matchers.containsString("Online Shopping Site for Mobiles,Fashion,Books,Electronics,Home Appliances & More @ Flipkart"));
	}

}

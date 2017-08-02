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

public class SelectproductTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "selectproduct.link")
	private QAFWebElement selectproductLink;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getSelectproductLink() {
		return selectproductLink;
	}

	public void selectCategory(String productname) {
		QAFExtendedWebElement selectproduct = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("selectproduct.link"), "iPad"));
		selectproduct.click();
	}
	public void verifyApplepage() {
		Validator.verifyThat("Apple phone page shouldbe displayed properly",driver.getTitle(), Matchers.containsString("Online Shopping Site for Mobiles,Fashion,Books,Electronics,Home Appliances & More @ Flipkart"));
	}

}

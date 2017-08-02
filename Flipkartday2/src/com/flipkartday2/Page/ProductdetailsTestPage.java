package com.flipkartday2.Page;

import java.util.HashMap;

import org.hamcrest.Matchers;

import com.flipkartday2.Utilies.CommonUtils;
import com.flipkartday2.bean.Productbean;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailsTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "mobilename.cart")
	private QAFWebElement mobilenameCart;
	@FindBy(locator = "mobileprice.cart")
	private QAFWebElement mobilepriceCart;
	@FindBy(locator = "add tocart")
	private QAFWebElement add_Tocart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getMobilenameCart() {
		return mobilenameCart;
	}

	public QAFWebElement getMobilepriceCart() {
		return mobilepriceCart;
	}

	public QAFWebElement getAdd_Tocart() {
		return add_Tocart;
	}
	public void verifyProductonCart()
	{
		if (driver.getWindowHandles().size() > 1) {
			CommonUtils.switchToWindow(driver);
		}
		getMobilenameCart().waitForVisible();
		HashMap<String, Productbean> productInfo2 = CommonUtils.getProductItems();
		for (String key : productInfo2.keySet()) {
			Productbean details = productInfo2.get(key);

			Validator.verifyThat(getMobilenameCart().getText(),
					Matchers.containsString(details.getProductName()));
			Validator.verifyThat(getMobilepriceCart().getText(),
					Matchers.containsString(details.getProductPrice()));
		}
	}
	

	  public void AddtoCartButton()
	  {
		  waitForPageToLoad();
		  getAdd_Tocart().waitForVisible();
		  add_Tocart.click();
	  }
}

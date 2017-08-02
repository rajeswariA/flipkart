package com.flipkartday2.Utilies;

import java.util.HashMap;

import com.flipkartday2.bean.Productbean;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;

public class CommonUtils {
	public static void setProductItem(HashMap<String, Productbean> productsList) {
		ConfigurationManager.getBundle().addProperty("product.information", productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, Productbean> getProductItems() {
		HashMap<String, Productbean> productsList;
		if (ConfigurationManager.getBundle().containsKey("product.information")) {
			productsList = ((HashMap<String, Productbean>) ConfigurationManager.getBundle()
					.getProperty("product.information"));

		} else {
			productsList = new HashMap<String, Productbean>();
			ConfigurationManager.getBundle().addProperty("product.information", productsList);
		}
		return productsList;
	}

	public static void switchToWindow(QAFWebDriver driver) {
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
	}

}

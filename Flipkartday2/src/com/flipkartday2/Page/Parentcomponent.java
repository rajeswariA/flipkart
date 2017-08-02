package com.flipkartday2.Page;

import java.util.HashMap;
import java.util.List;

import org.hamcrest.Matchers;

import com.flipkartday2.Utilies.CommonUtils;
import com.flipkartday2.bean.Productbean;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Validator;

public class Parentcomponent extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	@FindBy(locator = "productmain.component")
	private List<Productchildcomponent> producttotalcomponent;

	public List<Productchildcomponent> getProducttotalcomponent() {
		return producttotalcomponent;
	}

	public void StoreProductInformation()  {
		Validator.verifyThat(getProducttotalcomponent().size(), Matchers.greaterThan(0));
		getProducttotalcomponent().get(0).getMobilename().waitForVisible();


		for (Productchildcomponent childcomponent : getProducttotalcomponent()) {
			System.out.println("productname:"+childcomponent.getMobilename());
			System.out.println("productprice:"+childcomponent.getMobileprice());
			
		}

	}
	
	public void selectProductName(int index) {
		Productbean productbean = new Productbean();
		productbean.setProductName(
				getProducttotalcomponent().get(index).getMobilename().getText());
		productbean.setProductPrice(
				getProducttotalcomponent().get(index).getMobileprice().getText());
		HashMap<String, Productbean> productInfo = new HashMap<String, Productbean>();

		productInfo.put(productbean.productName, productbean);
		getProducttotalcomponent().get(index).getMobilename().click();
		CommonUtils.setProductItem(productInfo);
		QAFTestBase.pause(3000);
	}

	public void verifyAppleipadpage() {
		Validator.verifyThat("Apple ipad page shouldbe displayed properly", driver.getTitle(), Matchers
				.containsString("Apple Tablet/iPads - Buy Apple Tab Online at Best Prices In India | Flipkart.com"));
	}

}

package com.flipkartday2.Page;

import java.util.HashMap;
import java.util.List;

import org.testng.Assert;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AddtocartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lowHighTab")
	private QAFWebElement lowHighTab;
	@FindBy(locator = "NameOfMobile")
	private QAFWebElement nameOfMobile;
	@FindBy(locator = "FeatureOfmobile")
	private List<QAFWebElement> featureOfmobile;
	@FindBy(locator = "BuyNowTab")
	private QAFWebElement buyNowTab;
	@FindBy(locator = "AddToCartTab")
	private QAFWebElement addToCartTab;
	@FindBy(locator = "Carttab")
	private QAFWebElement carttab;
	@FindBy(locator = "mobileInCart")
	private QAFWebElement mobileincart;
      
	String  mobileName;
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getLowHighTab() {
		return lowHighTab;
	}

	public QAFWebElement getNameOfMobile() {
		return nameOfMobile;
	}

	public List<QAFWebElement> getFeatureOfmobile() {
		return featureOfmobile;
	}

	public QAFWebElement getBuyNowTab() {
		return buyNowTab;
	}

	public QAFWebElement getAddToCartTab() {
		return addToCartTab;
	}

	public QAFWebElement getCarttab() {
		return carttab;
	}
	
	
	public QAFWebElement getMobileincart() {
		return mobileincart;
	}
	
	public void selectlowToHighTab() {
		getLowHighTab().click();
	}

	public void lowToHighTab() {
		getLowHighTab().click();
	}

	public void selectLowestAmountIpad() {
		 mobileName = getNameOfMobile().getText();
		List<QAFWebElement> feature = getFeatureOfmobile();
		for (QAFWebElement features : feature) {
			System.out.println(features.getText());
		}
		System.out.println(mobileName);
		System.out.println();
		getNameOfMobile().click();
	}
	
	public void AddToCart() {
		
			getAddToCartTab().click();
		}
	
	
	public void verifyCart() {
		
		String Actual=getMobileincart().getText();
		Assert.assertEquals(Actual, mobileName);
		System.out.println("success");
		getCarttab().click();
	}
	
	
//	public void check()
//	{
//		HashMap<String,ProductBean> productInfo=new HashMap<String,ProductBean>();
//		productInfo.put("keyboard",productInfo);
//		
//		
//		
//				
////		ConfigurationManager.getBundle().getProperties("")
//		ConfigurationManager.getBundle().setProperty("product.name",productInfo);
//	}
	

}

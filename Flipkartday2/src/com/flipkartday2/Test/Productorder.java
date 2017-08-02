package com.flipkartday2.Test;

import org.testng.annotations.Test;

import com.flipkartday2.Page.AddtocartTestPage;
import com.flipkartday2.Page.HomaTestPage;
import com.flipkartday2.Page.Parentcomponent;
import com.flipkartday2.Page.ProductdetailsTestPage;
import com.flipkartday2.Page.SelectproductTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class Productorder extends WebDriverTestCase {

	@Test(groups = { "SMOKE" }, description = "Checking product")
	public void Testproductorderflow() {
		HomaTestPage homepage = new HomaTestPage();
		homepage.launchsite();
		homepage.verifyFlipKartHomePage();
		homepage.selectCategory("Electronics", "Apple");
		SelectproductTestPage selectproduct = new SelectproductTestPage();
		selectproduct.verifyApplepage();
		selectproduct.selectCategory("iPad");
		Parentcomponent parentcomponnet = new Parentcomponent();
		parentcomponnet.verifyAppleipadpage();
		parentcomponnet.StoreProductInformation();
		parentcomponnet.selectProductName(0);
		ProductdetailsTestPage productdetailpage=new ProductdetailsTestPage();
		productdetailpage.verifyProductonCart();
		productdetailpage.AddtoCartButton();
		
//		AddtocartTestPage addtocartpage = new AddtocartTestPage();
//		addtocartpage.selectlowToHighTab();
	// addtocartpage.selectLowestAmountIpad();
		// addtocartpage.AddToCart();
		// addtocartpage.verifyCart();
		//

	}

}

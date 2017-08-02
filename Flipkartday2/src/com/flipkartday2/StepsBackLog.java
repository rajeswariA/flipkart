/**
 * 
 */
package com.flipkartday2;

import com.flipkartday2.Page.HomaTestPage;
import com.flipkartday2.Page.Parentcomponent;
import com.flipkartday2.Page.ProductdetailsTestPage;
import com.flipkartday2.Page.SelectproductTestPage;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;

/**
 * @author rajeswari.allu
 *
 */
public class StepsBackLog {
	HomaTestPage homepage = new HomaTestPage();
	SelectproductTestPage selectproduct = new SelectproductTestPage();
	Parentcomponent parentcomponnet = new Parentcomponent();
	ProductdetailsTestPage productdetailpage = new ProductdetailsTestPage();

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer launches flipkart application")
	public void customerLaunchesFlipkartApplication() {
		HomaTestPage homepage = new HomaTestPage();
		homepage.launchsite();
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer selects {0} from {1} category")
	public void customerSelectsFromCategory(String menu, String submenu) {
		homepage.selectCategory("Electronics", "Apple");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer navigates to product category")
	public void customerNavigatesToProductCategory() {
		homepage.verifyFlipKartHomePage();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer selects {0} from product list")
	public void customerSelectsFromProductList(String productcategory) {
		selectproduct.selectCategory("productcategory");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer navigates to selectproduct page")
	public void customerNavigatesToSearchproductPage() {
		selectproduct.verifyApplepage();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer selects {0} product from product list")
	public void customerSelectsProductFromProductList(String index) {
		parentcomponnet.selectProductName(Integer.parseInt(index));

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer verifies product details matching correctly")
	public void customerVerifiesProductDetailsMatchingCorrectly() {
		parentcomponnet.StoreProductInformation();

	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "product has been added to cart")
	public void productHasBeenAddedToCart() {
		productdetailpage.verifyProductonCart();

	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "customer selects add to cart")
	public void customerSelectsAddToCart() {
		productdetailpage.AddtoCartButton();
		
	}

	
	

}

package com.flipkartday2.Page;

import java.util.List;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class Productchildcomponent extends QAFWebComponent {

	public Productchildcomponent(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	@FindBy(locator = "productname.component")
	private QAFWebElement mobilename;
	@FindBy(locator = "productprice.component")
	private QAFWebElement mobileprice;
	public QAFWebElement getMobilename() {
		return mobilename;
	}
	public QAFWebElement getMobileprice() {
		return mobileprice;
	}
//	public void mobilename()
// {
//		for(QAFWebElement e:getMobilename())
//		{
//			System.out.println(e.getText());
//		}
//		
//	}
//	
//	public void mobileprice()
//	 {
//			for(QAFWebElement e:getMobileprice())
//			{
//				System.out.println(e.getText());
//			}
//			
//		}
	
}

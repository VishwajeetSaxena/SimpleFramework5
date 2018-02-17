package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SelUtil;

public class Homepage {

	SelUtil sel = new SelUtil(); 
	
	@FindBy(id = "lst-ib")
	WebElement test;
	
	
	public void test() {
		sel.enterText(test, "hi");
	}

}

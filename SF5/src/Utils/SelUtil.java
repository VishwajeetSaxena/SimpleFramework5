package Utils;

import org.openqa.selenium.WebElement;

public class SelUtil {

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

}

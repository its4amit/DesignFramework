package pages;

import org.openqa.selenium.By;

import com.helper.Base;

public class PaymentPage extends Base{

	By addTOCart = By.xpath("");
	
	public void addToCartBtn() {
		
		waitForExpectedElement(addTOCart);
		
	}
	
	
}

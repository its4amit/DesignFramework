package pages;

import org.openqa.selenium.By;

import com.helper.Base;

public class PlpPage extends Base{

	By addTOCart = By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[1]");
	By cartCount = By.xpath("//span[@data-test='shopping-cart-badge']");
	
	public void addProductInCart() {
		
		waitForExpectedElement(addTOCart);
		
	}
	
	public void verifyMiniCartCount(String count) {
		validateText(cartCount, count);
	}
	
	public void clickOnMiniCartCount() {
		
		clickOnElement(cartCount);
	}
	
	
}

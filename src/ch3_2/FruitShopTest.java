package ch3_2;
import org.testng.annotations.*;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class FruitShopTest {
	List<String> cart = new ArrayList<>();
	
	@BeforeSuite
	public void welcome() {
		System.out.println("Welcome to the fruit shop");
	}
	
	@AfterSuite
	public void goodbye() {
		System.out.println("Goodbye and see you later");
	}
	
	@BeforeClass
	public void setupCart() {
		cart.add("Oranges");
		cart.add("Banana");
		cart.add("Apple");
		cart.add("Strawberry");
	}
	
	@Test (priority=1)
	public void CheckCartItemsCount() {
		Assert.assertEquals(cart.size(), 4,"Cart should have 4 items.");
	}
	
	@Test (priority=2)
	public void checkNoPineapple() {
		Assert.assertFalse(cart.contains("Pineapple"),"Cart shouldn't contain Pineapple!");
	}
	
	@Test (priority=3)
	public void checkSecondItem() {
		Assert.assertEquals(cart.get(1), "Banana","Second item must be banana!");
	}
	
	@Test (priority=4)
	public void checkSizeCartAferAdding() {
		cart.add("Mango");
		Assert.assertEquals(cart.size(), 5,"Cart have 5 items now after adding 'Mango' item");
	}
}

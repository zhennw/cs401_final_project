import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCart {
	ShoppingCart cart = new ShoppingCart();
	Item food = new Item(2, "bacon", 4.50, 2);
	Item food2 = new Item(5, "ham", 3.30, 1);
	Item food3 = new Item(2, "bacon", 4.50, 2);
	/*
	@Test
	//check empty cart
	void testemptyCart() {
		assertEquals(0, cart.cartsize());
	}
	
	@Test
	// check additem 
	void testnotempty()
	{
		cart.addItem(food);
		assertEquals(1, cart.cartsize());
		cart.displayCart();
	}
	
	@Test
	// check delete item
	void testdelete()
	{
		cart.addItem(food);
		cart.addItem(food2);
		cart.deleteItem("bacon");
		assertEquals(1, cart.cartsize());
		cart.displayCart();
	}
	*/
	@Test
	//check change quantity
	void testchangeqty()
	{
		cart.addItem(food);
		cart.changeQTY(food , 5);
		cart.displayCart();
		assertNotSame(food3.getquantity(), food.getquantity());
	}
	/*
	@Test
	void testitemnotincart()
	{
		cart.addItem(food);
		cart.deleteItem("bacun");
		assertEquals(1, cart.cartsize());
	}
	
	@Test
	//check payment
	void testpayment()
	{
		cart.addItem(food);
		cart.addItem(food2);
		cart.payment();
		assertEquals(0, cart.cartsize());
		cart.displayCart();
		
	}
	@Test
	//total cost
	void testtotalcost()
	{
		cart.addItem(food);
		double expected = 9.00;
		double actual = cart.totalcost();
		assertEquals(expected, actual);
		
	}
	*/
}

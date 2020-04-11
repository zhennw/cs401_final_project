import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestItem {
	Item food = new Item(3,"bacon",4.50, 2);
	@Test
	void testid() {
		int expected = 3;
		int actual = food.getid();
		assertEquals(expected, actual);
	}
	@Test
	void testname() {
		String expected = "bacon";
		String actual = food.getname();
		assertEquals(expected, actual);
	}
	@Test
	void testprice(){
		double expected = 4.50;
		double actual = food.getprice();
		assertEquals(expected, actual);
	}
	@Test
	void testquantity() {
		int expected = 2;
		int actual = food.getquantity();
		assertEquals(expected, actual);
	}
	@Test
	void testTostring() {
		String expected = "3 bacon $4.50 2";
		String actual = food.toString();
		assertEquals(expected, actual);
	}
}


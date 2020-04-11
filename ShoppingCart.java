import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {
static private DecimalFormat df = new DecimalFormat("#.00");
private ArrayList <Item> cartItems = new ArrayList<>();


	public ShoppingCart()
	{
		cartItems = new ArrayList<>();
	}
	//add item into cart
	public void addItem(Item item)
	{
		cartItems.add(item);
	}
	//search item name and remove from cart
	public void deleteItem(String itemName)
	{
		if(cartItems != null)
		 {
			for(int i = 0; i < cartItems.size(); i++)
			{
			   if(cartItems.get(i).getname().equals(itemName))
			   {
				   cartItems.remove(cartItems.get(i));
			   }
			   else
			   {
				   System.out.println("Item not in Cart");
			   }
			}
		}
		else
		{
		System.out.println("The Cart is empty");
		}
	}
	//search item name in cart then change the quantity
	public void changeQTY(Item item, int itemqunatity)
	{
		if(cartItems != null)
		{
			for(int i =0; i <cartItems.size();i++)
			{
				if(item.getname().equals(cartItems.get(i).getname()))
				{
					cartItems.get(i).setquantity(itemqunatity);
				}
			}
		}
		else {
		System.out.println("No item in cart to modify");
		}
	}
	//display item in cart
	public void displayCart()
	{
		if(cartItems == null)
		{
			System.out.println("Cart is empty");
		}
		else {
			System.out.println("Your Cart contains " + cartsize() + " item(s)");
		for(int i = 0; i < cartItems.size();i++)
		{
			System.out.println(cartItems.get(i).toString());
		}
		}
	}
	//display cart and total cost then empty cart
	public void payment()
	{
		displayCart();
		System.out.println("Total Cost " + "$" + df.format(totalcost()));
		System.out.println("Order is completed");
		cartItems.clear();
	}
	//size of cart
	public int cartsize()
	{
		return cartItems.size();
	}
	//get totalcost of item in cart
	public double totalcost()
	{ 
		double total = 0.00;
		for(int i =0; i < cartItems.size(); i++)
		{
			total += cartItems.get(i).getquantity() * cartItems.get(i).getprice();
		}
		return total;
	}
}
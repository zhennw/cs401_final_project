import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ZoneController {
	
	private ShoppingCart shopCart;
	private ShoppingCart myCart;
	private ShoppingCart history;
	private Scanner scan;
	
	public ZoneController()
	{
		shopCart = new ShoppingCart();
		myCart = new ShoppingCart();
		history = new ShoppingCart();
		scan = new Scanner(System.in);
	}
	public void zoneControll()
	{
		String[] store = {"Whole Foods A", "Whole Foods B", "Whole Foods C"};
		int choice;
		
		do {
			for(int i = 0; i < store.length ; i++)
			{
				System.out.println("Input " + i  + " for " + store[i]);
			}
			choice = scan.nextInt();
			switch(choice) {
			case 0: StoreA(); break;
			case 1: StoreB(); break;
			case 2: StoreC(); break;
			default: System.out.println("Invalid choice");
			}
	}
		while(choice >= 3);
	
	}
	public void StoreA()
	{
		String filename = "storeA.txt";
		int choice2;
		String[] commands = { "Add", "Remove", "Change Quantity","Display Store item","Payment", "Purchase History"};
		System.out.println("Items in Whole Foods A");
		shopCart.load("storeA.txt");
		shopCart.displayStore();
		do {
			for(int i = 0; i < commands.length; i++)
			{
				System.out.println("Input " + i + " for " + commands[i]);
			}
			choice2 = scan.nextInt();
			switch(choice2)
			{
			case 0: addtocart(filename); break;
			case 1: removefromcart(); break;
			case 2: changefromcart(); break;
			case 3: shopCart.displayStore(); break;
			case 4: pay(); break;
			case 5: displayHistory(); break;
			default: System.out.println("Invalid chioce");;
			}
		}while(choice2 != 4 );
		
	}
	public void StoreB()
	{
		String filename = "storeB.txt";
		int choice2;
		String[] commands = { "Add", "Remove", "Change Quantity","Display Store item","Payment", "Purchase History"};
		System.out.println("Items in Whole Foods B");
		shopCart.load("storeB.txt");
		shopCart.displayStore();
		do {
			for(int i = 0; i < commands.length; i++)
			{
				System.out.println("Input " + i + " for " + commands[i]);
			}
			choice2 = scan.nextInt();
			switch(choice2)
			{
			case 0: addtocart(filename); break;
			case 1: removefromcart(); break;
			case 2: changefromcart(); break;
			case 3: shopCart.displayStore(); break;
			case 4: pay(); break;
			case 5: displayHistory(); break;
			default: System.out.println("Invalid chioce");;
			}
		}while(choice2 != 4 );
	}
	public void StoreC()
	{
		String filename = "storeC.txt";
		int choice2;
		String[] commands = { "Add", "Remove", "Change Quantity","Display Store item","Payment", "Purchase History"};
		System.out.println("Items in Whole Foods B");
		shopCart.load("storeB.txt");
		shopCart.displayStore();
		do {
			for(int i = 0; i < commands.length; i++)
			{
				System.out.println("Input " + i + " for " + commands[i]);
			}
			choice2 = scan.nextInt();
			switch(choice2)
			{
			case 0: addtocart(filename); break;
			case 1: removefromcart(); break;
			case 2: changefromcart(); break;
			case 3: shopCart.displayStore(); break;
			case 4: pay(); break;
			case 5: displayHistory(); break;
			default: System.out.println("Invalid chioce");;
			}
		}while(choice2 != 4 );
	
		
	}
	public void addtocart(String filename)
	{
		int id, amount;
		System.out.println("Enter id number to add that item to your cart");
		id = scan.nextInt();
		System.out.println("Enter how many item you want");
		amount = scan.nextInt();
		myCart.addItem(id, amount, filename);
		myCart.displayCart();
	}
	public void removefromcart()
	{
		String itemName;
		System.out.println("Enter name of item to remove");
		itemName = scan.nextLine();
		itemName = scan.nextLine();
		for(int i = 0; i < myCart.cartsize(); i++)
		{
			myCart.deleteItem(itemName);
		}
		myCart.displayCart();
	}
	public void changefromcart()
	{
		int id , amount;
		System.out.println("Enter id of item quantity to change");
		id = scan.nextInt();
		System.out.println("Enter the new amount of item");
		amount = scan.nextInt();
		myCart.changeQTY(id, amount);
		myCart.displayCart();
	}
	public void pay()
	{
		myCart.payment();
		myCart.save("History.txt");
	}
	public void displayHistory()
	{
		System.out.println("Purchase History \n");
		history.loadhist("History.txt");
		history.displayHist();
	}

}
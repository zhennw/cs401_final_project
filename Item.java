import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Item {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	static private DecimalFormat df = new DecimalFormat("#.00");
	
	public Item(int itemid, String itemname, double itemprice, int itemquantity)
	{
		this.id = itemid;
		this.name = itemname;
		this.price = itemprice;
		this.quantity = itemquantity;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int itemid)
	{
		id = itemid;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String itemname)
	{
		name = itemname;
	}
	public double getprice()
	{
		return price;
	}
	public void setprice(float itemprice)
	{
		price = itemprice;
	}
	public int getquantity()
	{
		return quantity;
	}
	public void setquantity(int itemquantity)
	{
		quantity = itemquantity;
	}
	public String toString()
	{
		df.setRoundingMode(RoundingMode.CEILING);
		return "Item#" + id + " Item:" + name + "\n"+ "Price $" + df.format(price) + " Amount:" + quantity +"\n";
	}
}

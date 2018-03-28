
public class order {
	public pizza pizza;
	int order_id;
	String cust_name;
	int quantity;
	
	
	public order(pizza pizza,int order_id,String cust_name,int quantity,bill bill)
	{
		this.pizza=pizza;
		this.quantity=quantity;
		this.cust_name=cust_name;
		bill.addpizza(this);
	}
	
}








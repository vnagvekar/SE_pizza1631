import java.util.LinkedList;
public class bill{

	LinkedList<order> pizza = new LinkedList<order>();
	private float total;
	public void addpizza(order pizza)
	{
			this.pizza.add(pizza);
	
	}
	public void removepizza(order pizza)
	{
		this.pizza.remove(pizza);
	}
	
	public void printbill()
	{
		System.out.println("\t\t\t\t PIZZA");
		System.out.println("\t\t\t   *************************\n");
		System.out.println("\n");
		//public order(pizza pizza,int order_id,String cust_name,int quantity,bill bill)
		System.out.println("name		price		type	customer	quantity	total");
		System.out.println("***************************************************************************");
		for(int i=0; i<pizza.size();i++){
			System.out.println(this.pizza.get(i).pizza.getName()+"	 	"+this.pizza.get(i).pizza.getPrice()+"		"+this.pizza.get(i).pizza.getPtype()+"	"+this.pizza.get(i).cust_name+"	 "+this.pizza.get(i).quantity+"		"+this.pizza.get(i).quantity*this.pizza.get(i).pizza.getPrice());
			this.total+=this.pizza.get(i).quantity*this.pizza.get(i).pizza.getPrice();
			
		}
		System.out.println("****************************************************************************");
		
		System.out.println("\t\t\t\t\t\tTotal Price: "+this.total+"  Rps");
		System.out.println("\t\t\t\t\t\tTotal Price including GST(8%): "+(total+(total*8/100))+"  Rps");
		System.out.println("\n\n\t\t\t\t Thank You");
	}
}


public class pizza_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bill b=new bill();
		pizza p1=new pizza("corn star",300,"veg");
		pizza p2=new pizza("chicken tikka",800,"non veg");
		pizza p3=new pizza("chicken mafia",500,"non veg");
		new order(p1, 123,"rajesh",2,b);
		new order(p2, 130,"rajesh",1,b);
		new order(p3, 113,"rajesh",3,b);
		b.printbill();
	}

}

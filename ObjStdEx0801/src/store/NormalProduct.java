package store;

public class NormalProduct extends AbsProduct implements Deliverable{
	
	public NormalProduct(String name,int price) {
		super(name,price);
	}
	
	public void display() {
		System.out.println(getNameAndPrice());
	}
	
	public void displayDeliv() {
		System.out.println("【通常送料５００円】"+getNameAndPrice());
	}

}

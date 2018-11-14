package ex02;

public class Goods {
	
	private String name;
	private int price;
	private int count;
	
	public Goods() {
	}
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price= price;
		plusCount();
	}
	
	public void plusCount() { 
		count = count+1;
	}
	
	public int getCount() {
		return count;
	}
	
		
		public Goods(String name) {
			this(name, 0);
		}
		
		{
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPame() {
		return price;
	}
	
}
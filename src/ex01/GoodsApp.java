package ex01;

public class GoodsApp {

	public static void main(String[] args) {
        
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showinfo();
	
		
		//숙제 cup 해보세요~!
		
		Goods cup = new Goods();
		cup.setName("컵");
		cup.setPrice(3000);
	
		cup.showinfo();
	}
}


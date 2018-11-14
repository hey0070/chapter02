package ex02;

public class GoodsApp {

      public static void main(String[] args)  {
    	  Goods camera = new Goods("니콘",3000000);
    	  System.out.println(camera.getCount());
    	  
    	  Goods cup = new Goods("컵", 5000);
    	  Goods computer = new Goods("LG그램");
    	  System.out.println(computer.getCount());
    	  
    	  
       
          //Goods cup = new Goods("머그컵",3000);
          //System.out.println(cup.getName());
          //System.out.println(cup.getPrice(
    	  ));
          
                   
          //Goods camera = new Goods();
          //camera.setName("니콘");
          //camera.setPrice(400000);
          
          //System.out.println(camera.getName());
          //System.out.println(camera.getPrice());
	}


}

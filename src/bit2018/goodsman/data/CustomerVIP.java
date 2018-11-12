package bit2018.goodsman.data;

public class CustomerVIP extends Customer {
    void set() {
    	//public은 자식클래스에서 접근 o
    	name = "....";
    	//protected는 자식클래스에서 접근o
    	phone = "000-0000-0000";   	
    	//private은 자식클래스에서 접근x
    	//email = "hey@gmail.com";
    }
}

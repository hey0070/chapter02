package bit2018.goodsman.db;

import bit2018.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		
		//public은 다른패키지(외부)접근 o
		c.name = "정지현";
		
		//protected는 다른패키지(외부)접근 x
		//c.phone = "000-0000-0000";
		
		//private은 다른패키지(외부)접근 x
		//c.email = "hey@gamail.com";
		
	}
}

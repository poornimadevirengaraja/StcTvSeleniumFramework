package PageObjets;

public interface AllPlanElements {

	// Elements of Plans ( All country )
	//Subscription Plan Type Elements
	String litetype="//strong[@id='name-lite']";
	String classictype = "//strong[@id='name-classic']";
	String premiumtype = "//strong[@id='name-premium']";
	
	
	//Elements Subscription prices
	String liteprice="//div[@id='currency-lite']//b";
	String classicprice="//div[@id='currency-classic']//b";
	String premiumprice="//div[@id='currency-premium']//b";
	
	
	//Elements Subscription currency
	String litecurrency="//div[@id='currency-lite']//i";
	String classiccurrency="//div[@id='currency-classic']//i";
	String premiumcurrency="//div[@id='currency-premium']//i";
	
}

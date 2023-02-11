package Jv08Collections;

public class Jv08_ProductDTO {

	public Jv08_ProductDTO() {
		//상품 코드
		//상품명
		//가격
		//수량
		
	}
	public Jv08_ProductDTO(int productcode, String productname, int price, int amount) {
		this.productcode=productcode;
		this.productname=productname;
		this.price=price;
		this.amount=amount;
		
	}
	private int productcode;
	private String productname;
	private int price;
	private int amount;
	
	@Override
	public String toString() {
		return "[productcode : " + productcode + "\tproductname : " + productname + "\tprice : " + price
				+ "\tamount : " + amount + "]";
	}
	
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

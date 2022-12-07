package pro.otm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String itemId;

private Double itemTotal;

private int Quantity;
@ManyToOne
private Cart cart;
public Items() {
	// TODO Auto-generated constructor stub
}
public Items( String itemId, Double itemTotal, int quantity, Cart cart) {
	super();
	this.itemId = itemId;
	this.itemTotal = itemTotal;
	this.Quantity = quantity;
	this.cart = cart;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public Double getItemTotal() {
	return itemTotal;
}
public void setItemTotal(Double itemTotal) {
	this.itemTotal = itemTotal;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}




}

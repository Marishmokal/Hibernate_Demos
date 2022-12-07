package pro.tut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Accounts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String city;
private double balance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Accounts() {
	// TODO Auto-generated constructor stub
}
public Accounts(String name, String city, double balance) {
	super();
	this.name = name;
	this.city = city;
	this.balance = balance;
}


}

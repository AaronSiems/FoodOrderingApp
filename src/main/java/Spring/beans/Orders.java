package Spring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	@Column(name = "USER_ID")
	private int customerId;
	
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Orders(long id, int customerId) {
		super();
		this.orderId = id;
		this.customerId = customerId;
	}
	
	
	public long getId() {
		return orderId;
	}
	public void setId(long id) {
		this.orderId = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}

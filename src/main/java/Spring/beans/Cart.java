package Spring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_cart")
public class Cart {

	@Id
	@Column(name="cart_id")
	private long cartId;
	@Column(name="order_id")
	private long orderId;
	@Column(name="prod_id")
	private long prodId;
	@Column(name="prod_name")
	private String productName;
	@Column(name="prod_qty")
	private int productQty;
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="USER_ID")
	private User userId;
	@Column(name="request")
	private String request;
	
	public Cart() {
		super();
	}

	
	

	public Cart(long orderId, long prodId, String productName, int productQty, User userId) {
		super();
		this.orderId = orderId;
		this.prodId = prodId;
		this.productName = productName;
		this.productQty = productQty;
		this.userId = userId;
	}




	public Cart(long cartId, long orderId, long prodId, String productName, int productQty, User userId, String request) {
		super();
		this.cartId = cartId;
		this.orderId = orderId;
		this.prodId = prodId;
		this.productName = productName;
		this.productQty = productQty;
		this.userId = userId;
		this.request = request;
	}




	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}


	public long getOrderId() {
		return orderId;
	}


	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public long getProdId() {
		return prodId;
	}


	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public User getUserId() {
		return userId;
	}
	
	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	


	
	
	
	
	
}

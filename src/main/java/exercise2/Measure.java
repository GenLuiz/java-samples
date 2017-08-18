package exercise2;

public abstract class Measure {
	
	protected Double quantity;
	protected Types type;
	
	
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
}

package app.bike;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Motor_Cycle")
public class Bike {
	@Id
	@Column(name="Number")
	int model_num;
	@Column(name="Model")
	String brand;
	@Column(name="Price")
	int cost;

	public Bike(int model_num, String brand, int cost) {
		super();
		this.model_num = model_num;
		this.brand = brand;
		this.cost = cost;
	}
	public int getModel_num() {
		return model_num;
	}
	public void setModel_num(int model_num) {
		this.model_num = model_num;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [Model_num=" + model_num + ", Brand=" + brand + ", cost=" + cost
				+ "]";
	}
}

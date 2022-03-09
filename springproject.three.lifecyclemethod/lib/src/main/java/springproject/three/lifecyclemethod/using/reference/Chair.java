package springproject.three.lifecyclemethod.using.reference;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chair implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Chair() {
		
		super();
		System.out.println("***************************************************");
	}

	@Override
	public String toString() {
		return "Chair [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		System.out.println("__________________________________________________");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method");
		System.out.println("---------------------------------------------------");
		
	}
	
	

}

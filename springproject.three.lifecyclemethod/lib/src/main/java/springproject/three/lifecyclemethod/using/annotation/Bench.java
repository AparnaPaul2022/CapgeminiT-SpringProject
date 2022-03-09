package springproject.three.lifecyclemethod.using.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bench {
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Bench() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bench [length=" + length + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}

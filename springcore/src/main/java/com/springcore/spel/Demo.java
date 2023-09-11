package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Demo")
public class Demo {
	
	@Value("#{T(java.lang.Math).E}")//calling a static method of Math Class
	private double x;
	
	@Value("#{new java.lang.String('Vanshaj Jain')}")//creating an object of String Class
	private String y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")//calling static method of Math class
	private double z;
	
	@Value("#{8>3}")//this expression will return a boolean value
	private boolean a;
	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + "]";
	}

}

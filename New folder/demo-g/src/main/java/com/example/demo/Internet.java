package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Internet {
	private int speed;
	private int amount;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public  void connection() {
		System.out.println("Connection Established successfully");
	}

}

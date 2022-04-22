package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class connect {
	public connect() {
		System.out.println("hai gugan");
	}
	private String name;
	private int doorno;
	@Autowired
	private Internet moderm;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public void connectt(){
		moderm.connection();
		System.out.println("Connected Successfully");
	}
	

}

package com.phani.helloworld;

public class HelloIndia {
	private String message1;
	private String message;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setMessage1(String message){
		this.message1 = message;
	}
	public void getMessage1(){
		System.out.println("India Message : " + message1);
	}
}
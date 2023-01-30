package com.calculator.entity;

public class Operators {
	private String operation;
	private int a,b,c;
	
	public Operators() {
		super();
	}

	public Operators(int c) {
		super();
		this.c = c;
	}

	public Operators(String operation) {
		super();
		this.operation = operation;
	}

	public Operators(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	
	
	

}

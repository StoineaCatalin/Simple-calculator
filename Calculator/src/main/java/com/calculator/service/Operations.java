package com.calculator.service;


import org.springframework.stereotype.Service;

import com.calculator.entity.Operators;

@Service
public class Operations {
	public int add(Operators model) {
		return model.getA() + model.getB();
	}
	public int subtraction(Operators model) {
		return model.getA() - model.getB();
	}
	public int multiply(Operators model) {
		return model.getA() * model.getB();
	}
	public double divide(Operators model) {
		if(model.getA()==0) {
			return 0;
		}
		if(model.getB()==0) {
			return 0;
		}
		return (double) model.getA()/model.getB();
	}


}

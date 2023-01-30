package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.calculator.entity.Operators;
import com.calculator.service.Operations;

@Controller
public class CalculatorController {
	Operators operators = new Operators();

	@Autowired
	private Operations operations;

	@RequestMapping("/")
	public String getPage(Model model) {
		model.addAttribute("operators",operators);
		return "calculator";
	}
	@RequestMapping(value="/", params="add", method = RequestMethod.POST)
	public String add(@ModelAttribute("operators")Operators operators, Model model) {
		model.addAttribute("result", operations.add(operators));
		return "calculator"; 
	}
	@RequestMapping(value="/", params="subtraction", method = RequestMethod.POST)
	public String substraction(@ModelAttribute("operators")Operators operators, Model model) {
		model.addAttribute("result", operations.subtraction(operators));
		return "calculator"; 
	}
	@RequestMapping(value="/", params="multiply", method = RequestMethod.POST)
	public String multiply(@ModelAttribute("operators")Operators operators, Model model) {
		model.addAttribute("result", operations.multiply(operators));
		return "calculator";
	}
	@RequestMapping(value="/", params="divide", method = RequestMethod.POST)
	public String divide(@ModelAttribute("operators")Operators operators, Model model) {
		model.addAttribute("result", operations.divide(operators));
		return "calculator";
		
	}
}
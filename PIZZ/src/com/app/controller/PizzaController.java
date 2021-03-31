package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IPizzaService;

@RestController // @Controller + @RespBody
@CrossOrigin//(origins="http://localhost:4200")
@RequestMapping("/pizzas")
public class PizzaController {
	@Autowired
	private IPizzaService pizzaService;

	@PostConstruct
	public void init() {
		System.out.println("in init " + pizzaService);
	}
}

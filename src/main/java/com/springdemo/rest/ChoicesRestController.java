package com.springdemo.rest;

import com.springdemo.entity.Choice;
import com.springdemo.entity.Inventory;
import com.springdemo.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChoicesRestController {


	@Autowired
	private ChoiceService choiceService;


	@PostMapping("/choices")    //@RequestBody to access the request body as POJO
	public Choice addChoice(@RequestBody Choice theChoice) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		theChoice.setId(0);  // 0 means DAO insert new customer

		choiceService.saveChoice(theChoice);

		return theChoice;
	}

	// add mapping for GET /inventory
	@GetMapping("/choices/inventory")
	public Inventory getInventory() {

		return choiceService.getInventory();

	}

}



















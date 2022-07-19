package com.nit.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.WebEntity;
import com.nit.service.WebService;
import java.util.*;

@RestController
public class WebController {
	
	@Autowired
	private WebService wsr;
	
	@PostMapping("/insert")
	private ResponseEntity<?> insert(@RequestBody WebEntity wsd)
	{
		try {
			wsr.addNew(wsd);
			return new ResponseEntity<WebEntity>(wsd,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<String>("Cannot Save The data",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/all/{id}")
	private WebEntity userInput(@PathVariable (value="id")int someVariable)
	{
		return wsr.findByUserValue(someVariable);
	}
	
	@GetMapping("/uservalue")
	private List<WebEntity> view()
	{
		return wsr.showall();
	}

}

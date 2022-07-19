package com.nit;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Debanjan;
import com.nit.service.DebanajanService;

@RestController
public class DebanjanController {
	
	@Autowired
	private DebanajanService dst;
	
	@PostMapping("/add")
	public ResponseEntity<?> addSave(@RequestBody Debanjan ds)
	{
try {
	dst.someName(ds);
	return new ResponseEntity<Debanjan>(ds,HttpStatus.OK);
}
	catch(NoSuchElementException e)
	{
		return new ResponseEntity<>("Unable to Save",HttpStatus.NOT_FOUND);
	}
}
}

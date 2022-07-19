package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Debanjan;
import com.nit.repo.DebanjanRepo;
import java.util.*;

@Service
public class DebanajanService {
	
	@Autowired
	private DebanjanRepo dr;
	
	public void someName(Debanjan d)
	{
		dr.save(d);
	}

}

package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;

import com.nit.entity.WebEntity;
import com.nit.repository.WebRepo;

@Service
public class WebService {
	
	@Autowired
	private WebRepo wr;
	
	public void addNew(WebEntity ds)
	{
		wr.save(ds);
	}

	public WebEntity findByUserValue(int id)
	{
		return wr.findById(id).get();
	}
	
	public List<WebEntity> showall()
	{
		return wr.findAll();
	}
}

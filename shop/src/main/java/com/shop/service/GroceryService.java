package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.model.Grocery;
import com.shop.repository.GroceryRepository;

@Service
public class GroceryService {
	@Autowired
	GroceryRepository c;
	public List<Grocery> get()
	{
		List<Grocery> d=c.findAll();
		return d;
	}
	public Grocery savePro(Grocery g)
	{
		Grocery f=c.save(g);
		return f;
	}
	public Grocery updatePro(Grocery g)
	{
		Grocery f=c.save(g);
		return f;
	}
	public void del(Integer sno)
	{
		c.deleteById(sno);
	}
}

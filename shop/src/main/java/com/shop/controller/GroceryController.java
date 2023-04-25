package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.model.Grocery;
import com.shop.service.GroceryService;

@RestController
public class GroceryController {
	@Autowired
	GroceryService s;
	@GetMapping(value="/fetch")
	public List<Grocery> get()
	{
		List<Grocery> x=s.get();
		return x;
	}
	@PostMapping(value="/post")
	public Grocery savePro(@RequestBody Grocery g)
	{
		Grocery f=s.savePro(g);
		return f;
	}
	@PutMapping(value="/put")
	public Grocery updatePro(@RequestBody Grocery g)
	{
		Grocery f=s.updatePro(g);
		return f;
	}
	@DeleteMapping(value="/delete/{rno}")
	public void del(@PathVariable("rno") Integer sno)
	{
		s.del(sno);
	}

}

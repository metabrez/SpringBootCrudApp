package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.model.Stadium;
import com.edu.service.StadiumService;

@Controller
public class StadiumController {
	
	
	@Autowired
	private StadiumService stadiumService;
	
	
	@RequestMapping(value="/stadiums",method=RequestMethod.GET)
	public String getAll(Model model){
		
		List<Stadium> s=stadiumService.getAll();
		
		model.addAttribute("stadiumListKey", s);
		
		return "stadiumList";
	}
	
	@RequestMapping(value="/stadiums",method=RequestMethod.POST)
	public String addStadium(Stadium stadium){
		
		stadiumService.add(stadium);
		
		return "redirect:/stadiums";
	}
	
	@RequestMapping(value="/stadiums/{id}",method=RequestMethod.GET)
	public String get(@PathVariable int id,Model model){
		
		model.addAttribute("stadium", stadiumService.get(id));
		
		return "stadiumDetails";
	}

	@RequestMapping(value="/stadiums/{id}",method=RequestMethod.POST)
	public String update(@PathVariable int id,Stadium stadium){
		
		stadium.setStadiumKey(id);
		
		stadiumService.update(id, stadium);
		
		return "redirect:/stadiums";
	}
	@RequestMapping(value="/stadiums/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id,Stadium stadium){
		
		stadiumService.delete(id);
		
		return "redirect:/stadiums";
		
	}
}

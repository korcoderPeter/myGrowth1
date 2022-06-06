package com.growth.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.growth.cafe.service.SnsService;

@Controller
public class HomeController {
	
	@Autowired
	private SnsService ss;

	@GetMapping({"","/"})
	public String home(Model model, @PageableDefault( sort = "id") Pageable p) {
		
		model.addAttribute("snsList", ss.SnsSelect(p));
		return "index";
	}
}

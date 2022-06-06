package com.growth.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.growth.cafe.model.Sns;
import com.growth.cafe.service.ReplyService;
import com.growth.cafe.service.SnsService;

@Controller
public class SnsController {

	@Autowired
	private SnsService ss;
	
	
	
	@GetMapping("/snswrite")
	public String snsWrite() {
		
		
		return "sns/SnsWrite";
	}
	@GetMapping("/snsDetail/{id}")
	public String snsWrite(@PathVariable int id, Model model) {
		
		model.addAttribute("snsDetail", ss.SnsDetail(id));
		
		
		
		return "sns/SnsDetail";
	}
	@GetMapping("/snsUpdate/{id}")
	public String snsUpdate(@PathVariable int id, Model model) {
		model.addAttribute("snsUpdate", ss.SnsDetail(id));
		
		return "sns/SnsUpdate";
	}
	
	
	
	
}

package com.growth.cafe.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.growth.cafe.dto.ResponseDto;
import com.growth.cafe.model.Reply;
import com.growth.cafe.service.ReplyService;

@RestController
public class ReplyApiController {
	@Autowired
	private ReplyService rs;

	@PostMapping("/api/replyWrite")
	public ResponseDto<Integer> replyWrite(Reply r ){
		System.out.println("성공");
		rs.replyWrite(r);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	
}

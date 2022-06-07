package com.growth.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.growth.cafe.model.Reply;
import com.growth.cafe.model.Sns;
import com.growth.cafe.repository.ReplyRepository;

@Service
public class ReplyService {

	@Autowired
	private ReplyRepository rr;
	
	
	//insert 
	@Transactional
	public void replyWrite(Reply r) {
		r.setUserid("임시 아이디");
		System.out.println(r.getContent());
		
		rr.save(r);
	}

	
}

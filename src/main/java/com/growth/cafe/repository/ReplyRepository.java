package com.growth.cafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.growth.cafe.model.Reply;
import com.growth.cafe.model.Sns;


@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer>{
	
}

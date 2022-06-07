package com.growth.cafe.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable = false, length = 200)
	private String content;
	@JsonIgnoreProperties({"replys"})
	@ManyToOne
	private Sns snsid;
	
	// 바꿔야함------------
	@Column(nullable = false, length = 20)
	private String userid;
	// --------------------
	
	@CreationTimestamp
	private Timestamp createDate;

	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Sns getSnsid() {
		return snsid;
	}

	public void setSnsid(Sns snsid) {
		this.snsid = snsid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Reply(int id, String content, Sns snsid, String userid, Timestamp createDate) {
		super();
		this.id = id;
		this.content = content;
		this.snsid = snsid;
		this.userid = userid;
		this.createDate = createDate;
	}
	
	
	
}

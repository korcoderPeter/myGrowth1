package com.growth.cafe.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Sns {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;

	@Column(nullable = false, length = 100)
	public String title;

	@Lob
	public String content;
	
	@Column(nullable = false, length = 20)
	public String userName;

	@CreationTimestamp
	public Timestamp createTime;

	@OneToMany(mappedBy = "Sns", fetch = FetchType.EAGER)
	public List<Reply> replys;

	/////////////////////////////////////////////////////////////////

	public Sns() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public List<Reply> getReplys() {
		return replys;
	}

	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}

	public Sns(int id, String title, String content, String userName, Timestamp createTime, List<Reply> replys) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.createTime = createTime;
		this.replys = replys;
	}

}

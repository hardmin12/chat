package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Member {

	@Id
	@GeneratedValue(generator = "chat_id_generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "chat_id_generator", allocationSize=1, sequenceName="chat_seq")
	@Column(name = "MEMBER_ID")
	private Long idAuto;
	
	//@Column(unique = true, nullable = false)
	private String id;
	private String pw;
	
	
	public Long getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(Long idAuto) {
		this.idAuto = idAuto;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}

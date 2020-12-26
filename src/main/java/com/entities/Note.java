package com.entities;

import java.util.Date;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "note")
public class Note {
	@Id
	private Integer id;
	@Column(name = "content" ,length = 1500)
	private String content;
	@Column(name = "tittle")
	private String tittle;
	@Column(name = "date")
	private Date addedDate;
	
	public Note(String tittle, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.content = content;
		this.tittle = tittle;
		this.addedDate = addedDate;
	}
	
	
	public Note() {
		super();
		
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id" +id + "tittle"+tittle +"content"+content;
	}

}

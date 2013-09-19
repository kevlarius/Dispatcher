package com.kessy.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Contact")
public class Contact {
	
	@XmlElement(name = "Name", required = true)
	private String name;

	@XmlElement(name = "Rank", required = true)
	private String rank;
	
	@XmlElement(name = "Phone", required = true)
	private String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Contact(String name, String rank, String phone) {
		super();
		this.name = name;
		this.rank = rank;
		this.phone = phone;
	}
	
	public Contact() {}
}

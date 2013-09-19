package com.kessy.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
public class TaskLight {
	
	@XmlElement(name = "TaskID", required = true)
	private String taskId;
	
	@XmlElement(name = "CompanyID", required = true)
	private String companyId;
	
	@XmlElement(name = "DriverID", required = true)
	private String driverId;
	
	@XmlElement(name = "CompanyName", required = true)
	private String companyName;
	
	@XmlElement(name = "DeliveryTime", required = true)
	private String deliveryTime;
	
	@XmlElement(name = "DriverName", required = true)
	private String driverName;
	
	@XmlElement(name = "Address", required = true)
	private String address;
	
	@XmlElement(name = "Comment", required = true)
	private String comment;
	
	@XmlElement(name = "LastStatus", required = true)
	private String lastStatus;
	
	@XmlElement(name = "LastStatusDate", required = true)
	private String lastStatusDate;
	
	@XmlElement(name = "Contact", required = true)
	private Contact contact;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLastStatusDate() {
		return lastStatusDate;
	}

	public void setLastStatusDate(String lastStatusDate) {
		this.lastStatusDate = lastStatusDate;
	}
	
	public String getLastStatus() {
		return lastStatus;
	}

	public void setLastStatus(String lastStatus) {
		this.lastStatus = lastStatus;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public TaskLight(String taskId, String companyId, String driverId,
			String companyName, String deliveryTime, String driverName,
			String address, String comment, String lastStatus, String lastStatusDate,
			Contact contact) {
		super();
		this.taskId = taskId;
		this.companyId = companyId;
		this.driverId = driverId;
		this.companyName = companyName;
		this.deliveryTime = deliveryTime;
		this.driverName = driverName;
		this.address = address;
		this.comment = comment;
		this.lastStatus = lastStatus;
		this.lastStatusDate = lastStatusDate;
		this.contact = contact;
	}
	
	public TaskLight() {}
}


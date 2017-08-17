package org.data;

import java.util.Date;

public class Applicant {
	private String name;
	private Long age;
	private Address address;
	private Date localDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLocalDate() {
		return localDate;
	}
	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "Applicant [name=" + name + ", age=" + age + ", localDate="
				+ localDate + "]";
	}
	
	
}

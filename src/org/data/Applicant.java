package org.data;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.validator.IsValidName;

public class Applicant {

	@Size(min = 5, max = 30)
	@IsValidName(listOfNames="Sid")
	private String name;

	@Max(100)
	@Min(10)
	private Long age;

	private Address address;

	@Future
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

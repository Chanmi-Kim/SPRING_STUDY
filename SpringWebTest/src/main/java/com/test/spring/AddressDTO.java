package com.test.spring;

public class AddressDTO {

	private String name;
	private String age;
	private String address;
	private String tel;
	private String email;
	
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", age=" + age + ", address=" + address + ", tel=" + tel + ", email="
				+ email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}

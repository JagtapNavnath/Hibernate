package com.deleteOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="fname")
private String uname;
@Column(name="city")
private String city;
@Column(name="contact")
private String contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

}

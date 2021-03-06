package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	//primary key
	private Integer userId;
	private String userName, userMobile, userEmail,userPassword,userAddress;
	//Enum type by default role customer
	private UserRole userRole;
	//one to many mapping 
	private List<OrderDetail> orderList;
	
public User() {
	System.out.println("In USER pojo ctor");
}

//public User( String userName, String userMobile, String userEmail, String userPassword,
//		String userAddress, UserRole userRole) {
//	super();
//	this.userName = userName;
//	this.userMobile = userMobile;
//	this.userEmail = userEmail;
//	this.userPassword = userPassword;
//	this.userAddress = userAddress;
//	this.userRole = userRole;
//}
public User(Integer userId, String userName, String userMobile, String userEmail, String userPassword,
		String userAddress) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userMobile = userMobile;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.userAddress = userAddress;
}

//autogenerated primary key
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getUserId() {
	return userId;
}



public void setUserId(Integer userId) {
	this.userId = userId;
}
@Column(length = 20)
public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}
@Column(nullable = false,unique = true,length = 13)
public String getUserMobile() {
	return userMobile;
}

public void setUserMobile(String userMobile) {
	this.userMobile = userMobile;
}
//email should be unique
@Column(length = 20,unique = true)
public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
//password should not null
@Column(length = 20,nullable = false)
public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
@Column(length = 50)
public String getUserAddress() {
	return userAddress;
}

public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}

@Enumerated(EnumType.STRING)
public UserRole getUserRole() {
	return userRole;
}

public void setUserRole(UserRole userRole) {
	this.userRole = userRole;
}
@JsonIgnore
@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,orphanRemoval = true)
public List<OrderDetail> getOrderList() {
	return orderList;
}

public void setOrderList(List<OrderDetail> orderList) {
	this.orderList = orderList;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile + ", userEmail="
			+ userEmail + ", userPassword=" + userPassword + ", userAddress=" + userAddress + "]";
}

//@Override
//public String toString() {
//	return "User [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile + ", userEmail="
//			+ userEmail + ", userPassword=" + userPassword + ", userAddress=" + userAddress + ","
//					+ " userRole=" + userRole
//			+ "]";
//}



}

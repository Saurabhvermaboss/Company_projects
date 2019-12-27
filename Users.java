package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "usertable")

public class Users
{
private String name;
@Id
private int id;
private int points;
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}

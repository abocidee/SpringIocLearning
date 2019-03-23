package cn.tedu.spring.entity;

import org.springframework.beans.factory.annotation.Required;

public class Dog {
 private String name;

 public Dog() {
	 
 }
public Dog(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}
@Required
public void setName(String name) {
	this.name = name;
}
 
}

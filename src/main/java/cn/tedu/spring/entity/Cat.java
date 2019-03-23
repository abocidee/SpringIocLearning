package cn.tedu.spring.entity;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


public class Cat {
 private String name;
public Cat() {
	
}
public Cat(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
 public void catMouse() {
	 System.out.println("catching mouse");
 }
 
}

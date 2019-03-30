package cn.tedu.spring.entity;

public class LuNongYun {
 private String name;
 private String gender;
 
 
public LuNongYun() {
	
}
public LuNongYun(String name) {
	super();
	this.name = name;
}
public LuNongYun(String name, String gender) {
	super();
	this.name = name;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
	
 
}


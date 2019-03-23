package cn.tedu.spring.entity;

import org.springframework.beans.factory.annotation.Required;

public class Duck {
  private String name;

public Duck() {
	super();
}

public String getName() {
	return name;
}

@Required
public void setName(String name) {
	this.name = name;
}
  
  
}

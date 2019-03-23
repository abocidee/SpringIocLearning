package cn.tedu.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Elephant {
 private String name;

public Elephant() {
	super();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void elephantSwimming() {
	System.out.println("elephant is swimming");
}
 
}

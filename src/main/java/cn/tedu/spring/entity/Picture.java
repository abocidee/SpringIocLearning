package cn.tedu.spring.entity;

import javax.annotation.Resource;

public class Picture {
  private String name;
  @Resource
  private Pen pen;
  
public Picture() {
	super();
}
public Picture(String name, Pen pen) {
	super();
	this.name = name;
	this.pen = pen;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Pen getPen() {
	return pen;
}
public void setPen(Pen pen) {
	this.pen = pen;
}
  
  
  
}

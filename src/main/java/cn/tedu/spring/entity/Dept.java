package cn.tedu.spring.entity;

import java.io.Serializable;

public class Dept  implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 2117215888216080738L;
  private Integer dept;
  private String dName;
  private String loc;
  
  
public Dept() {
	super();
}
public Integer getDept() {
	return dept;
}
public void setDept(Integer dept) {
	this.dept = dept;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
  
  
}

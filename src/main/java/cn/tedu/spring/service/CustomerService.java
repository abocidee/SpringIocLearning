package cn.tedu.spring.service;

public class CustomerService {
 private String name ;
 private String url ;
  public CustomerService() {
	  
  }
  
public CustomerService(String name, String url) {
	super();
	this.name = name;
	this.url = url;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
  
  public void printName() {
	  System.out.println("name is " +this.name);
  }
  
  public void printUrl() {
	  System.out.println("url is" + this.url);
	  
  }
  
  public void throwException() {
	  throw new IllegalArgumentException();
  }
}

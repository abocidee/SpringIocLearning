package cn.tedu.spring.entity;

import java.sql.Timestamp;

public class Movie {
   private String name;
   private Timestamp onlinedate;
   
   public  Movie() {
	   
   }

public Movie(String name) {
	super();
	this.name = name;
}

public Timestamp getOnlinedate() {
	return onlinedate;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setOnlinedate(Timestamp onlinedate) {
	this.onlinedate = onlinedate;
}

public Movie(String name, Timestamp onlinedate) {
	super();
	this.name = name;
	this.onlinedate = onlinedate;
}
   
public void sayHello() {
	System.out.println("movie class Hello");
}
   
}

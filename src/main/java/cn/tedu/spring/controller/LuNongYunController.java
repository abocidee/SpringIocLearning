package cn.tedu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import cn.tedu.spring.entity.LuNongYun;
import cn.tedu.spring.entity.Movie;
@Controller
public class LuNongYunController {

private LuNongYun luNongyun;
private Movie movie;


	@Autowired
	@Qualifier(value="half")
	public void setLuNongyun(LuNongYun luNongyun) {
		this.luNongyun = luNongyun;
	}
	
	/*@Autowired
	@Qualifier(value="action")
	public void setMovie(Movie movie) {
		this.movie=movie;
	}*/
	
	public void run() {
		System.out.println(luNongyun.getName()+luNongyun.getGender()+"\n");
	   //movie.sayHello();
	}
}

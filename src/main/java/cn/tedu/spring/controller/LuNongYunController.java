package cn.tedu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import cn.tedu.spring.entity.LuNongYun;
@Controller
public class LuNongYunController {

private LuNongYun luNongyun;
	
	@Autowired
	@Qualifier(value="half")
	public void setLuNongyun(LuNongYun luNongyun) {
		this.luNongyun = luNongyun;
	}
	
	public void run() {
		System.out.println(luNongyun.getName()+luNongyun.getGender());
	}
}

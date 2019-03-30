package cn.tedu.spring.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import cn.tedu.spring.config.MovieConfiguration;
import cn.tedu.spring.entity.Cat;
import cn.tedu.spring.entity.Elephant;
@Controller
public class CatController {
    
	private Cat cat;
	
    @Autowired
	@Required
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	@Test
	public void test() {
		ApplicationContext aContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		Cat cat=aContext.getBean(Cat.class);
		cat.catMouse();
		System.out.println(cat.getName());
		aContext.getBean(Elephant.class).elephantSwimming();
	}
	
}

package cn.tedu.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cn.tedu.spring.entity.Cat;

@Configuration
@ComponentScan(basePackages="cn.tedu.spring.config")
public class MovieConfiguration {
  
	@Bean
	@Primary
	public Cat  instantiationCat() {
		return new Cat();
	}
	
	@Bean
	public Cat returninstantiationCat() {
		return new Cat("cat property");
	}
}

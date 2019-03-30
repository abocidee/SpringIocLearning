package cn.tedu.spring.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/**
 * 用于测试在componnt里面放置@bean
 * @author abocide
 *
 */

import cn.tedu.spring.entity.Tyson;
@Component
public class FactoryMethodComponent {
 
	
	@Bean
	public Tyson geTyson() {
		return new Tyson();	
	}
	
}

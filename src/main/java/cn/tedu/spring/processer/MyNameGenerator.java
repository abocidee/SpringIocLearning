package cn.tedu.spring.processer;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class MyNameGenerator  implements BeanNameGenerator{

	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		return definition.getBeanClassName();
	}

}

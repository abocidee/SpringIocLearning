package cn.tedu.spring.processer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import cn.tedu.spring.entity.Dog;
import cn.tedu.spring.entity.Movie;

public class BeanFactorypp implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		Movie movie =(Movie) beanFactory.getBean("movie");
		Dog dog=beanFactory.getBean(Dog.class);
        System.out.println("beanfactory post called"+movie.getName()+dog.getName());
	}

}

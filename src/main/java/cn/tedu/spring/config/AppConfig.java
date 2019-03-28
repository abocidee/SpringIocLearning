package cn.tedu.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 测试filters 两种方式 浏览指定的路径包
 * @author abocide
 *
 */
@Configuration
@ComponentScan(basePackages= {"cn.tedu.spring.controller","cn.tedu.spring.service"},
includeFilters = @Filter(type=FilterType.ANNOTATION ,value=Service.class),
excludeFilters = @Filter(type=FilterType.ANNOTATION ,value=Controller.class))
public class AppConfig {
 
	
}

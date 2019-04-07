package cn.tedu.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommonTypeAnnotation {

	public enum  Priority{
		LOW,MEDIUM,HIGH
	}
	Priority priority() default  Priority.MEDIUM;
	String[] tags() default "";
	String createBy() default "LuNongYun";
	String lastModified() default "07/03/2019";
	
	
}

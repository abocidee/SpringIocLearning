import java.lang.reflect.Method;

import org.springframework.transaction.interceptor.MethodMapTransactionAttributeSource;

import com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation;


import cn.tedu.spring.annotation.AnnotationExample;
import cn.tedu.spring.annotation.CommonMethodAnnotation;
import cn.tedu.spring.annotation.CommonTypeAnnotation;

public class AnnotationTest {
   
	public static void main(String[] args) {
		System.out.println("prcessing");
		int success= 0,failed=0,tatal=0,disabled=0;
		Class<AnnotationExample>  obj =AnnotationExample.class;
		
		int len=0;
		//process custom type annotation 
		if(obj.isAnnotationPresent(CommonTypeAnnotation.class)) {
			
			CommonTypeAnnotation annotation =obj.getAnnotation(CommonTypeAnnotation.class);
			len=annotation.tags().length;
           System.out.println("Priority " +annotation.priority());
           System.out.println("createtby"+ annotation.createBy());
           System.out.println("tags" + annotation.tags());
           
           for(String s:annotation.tags()) {
               System.out.println(s);
           }
           
		}
		
		//process commontype annotation 
		for(Method method:obj.getDeclaredMethods()) {
			if(method.isAnnotationPresent(CommonMethodAnnotation.class)) {
				System.out.println(method.getName());
			}
		}
		
		
	}
}

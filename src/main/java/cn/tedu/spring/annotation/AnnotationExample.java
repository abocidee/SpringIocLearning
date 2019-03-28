package cn.tedu.spring.annotation;
@CommonTypeAnnotation(
		priority=CommonTypeAnnotation.Priority.HIGH,
		createBy = "lunongyun",
		tags = {
				"java" ,"annotationsdfghjkl"
		}	
		)
public class AnnotationExample {
    @CommonMethodAnnotation
	String shouldAlwaysBeProcessed() {
		return "this should always be processed";
		
	}
    
    @CommonMethodAnnotation
    void willThrowException() {
    	throw new RuntimeException("this will throw an exception");
    }
    
    @CommonMethodAnnotation
    void shouldNotBeProcessed() {
    	throw new RuntimeException("this should never be processed ");
    	
    }
}

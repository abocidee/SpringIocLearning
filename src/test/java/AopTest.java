import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.service.CustomerService;

public class AopTest {
   @Test
   public void testCustomerService() {
	   ApplicationContext applicationContext= new ClassPathXmlApplicationContext(
			   new String[] {
					   "bean2.xml"
			   });
	  CustomerService customerService= (CustomerService) applicationContext.getBean("customerServiceProxy");
	   
	  customerService.printName();
	  customerService.printUrl();
	  try {
		  customerService.throwException();
	} catch (Exception e) {
		
	}
	  ((AbstractApplicationContext) applicationContext).close();
   }
}

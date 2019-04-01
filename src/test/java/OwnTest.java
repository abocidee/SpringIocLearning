import java.io.InputStream;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.junit.Test;

import cn.tedu.spring.io.suport.ResourceClassPath;

public class OwnTest {
	@Test
   public  void test() {
	String path ="bean.xml";
	ClassLoader  classLoader = OwnTest.class.getClassLoader();
	ResourceClassPath resourceClassPath = new ResourceClassPath(path, classLoader);
	 InputStream iStream=resourceClassPath.getInputStream();
	//InputStream iStream =OwnTest.class.getClassLoader().getResourceAsStream(path);
	System.out.println(iStream);
   }
	
	
	
}

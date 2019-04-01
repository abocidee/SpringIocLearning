package cn.tedu.spring.io.suport;

import java.io.InputStream;

import cn.tedu.spring.io.AbstractClassPathResource;

public class ResourceClassPath extends AbstractClassPathResource{
private final String path;
private ClassLoader classLoader;
public ResourceClassPath(String path, ClassLoader classLoader) {
	super();
	this.path = path;
	this.classLoader = classLoader;
}
public ClassLoader getClassLoader() {
	return classLoader;
}
public void setClassLoader(ClassLoader classLoader) {
	this.classLoader = classLoader;
}
public String getPath() {
	return path;
}

public InputStream getInputStream() {
	// TODO Auto-generated method stub
	return this.classLoader.getResourceAsStream(this.path);
};




}

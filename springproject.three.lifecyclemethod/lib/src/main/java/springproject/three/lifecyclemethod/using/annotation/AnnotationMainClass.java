package springproject.three.lifecyclemethod.using.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("usingannotation.xml");
		Bench bench1=(Bench) context.getBean("bench1");
		System.out.println(bench1);
		context.registerShutdownHook();
	}

}

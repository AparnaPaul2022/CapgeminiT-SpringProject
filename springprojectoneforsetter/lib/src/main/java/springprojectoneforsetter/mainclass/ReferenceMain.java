package springprojectoneforsetter.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springprojectoneforsetter.reference.A;

public class ReferenceMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("reference.xml");
		A a =(A) context.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getOb());
		System.out.println(a.getOb().getY());
		System.out.println(a);
	}

}

package springproject.four.using.autowiring.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.four.using.autowiring.usingxml.Emp;

public class XmlMainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlautowiring.xml");
		Emp emp1=(Emp) context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}

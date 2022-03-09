package springproject.two.using.constructor.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.two.using.constructor.ambiguity.Addition;

public class ConstructorAmbiguity {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ambiguityconstructor.xml");
		Addition a1=(Addition) context.getBean("add1");
		a1.doSum();
		System.out.println("------------------------------------------------------");

		Addition a2=(Addition) context.getBean("add2");
		a2.doSum();
		
		System.out.println("------------------------------------------------------");

		Addition a3=(Addition) context.getBean("add3");
		a3.doSum();
	}

}

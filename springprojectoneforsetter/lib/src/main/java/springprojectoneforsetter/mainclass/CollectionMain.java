package springprojectoneforsetter.mainclass;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springprojectoneforsetter.collection.Emp;

public class CollectionMain {

	public static void main(String[] args) {

		String springConfigurationFile = "collectionconfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getTopics());

	}

}

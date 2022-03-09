package springproject.two.using.constructor.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.two.using.constructor.basicclass.Person;

public class Constrctorclass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("forconstructorconfig.xml");
		Person p1=(Person) context.getBean("person1");
		Person p2=(Person) context.getBean("person2");
		System.out.println(p1);
		System.out.println(p2);

	}

}

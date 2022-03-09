package springproject.four.using.autowiring.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationMainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("annotationautowiring.xml");
		Student s1=(Student) context.getBean("s1",Student.class);
		System.out.println(s1);
				
	}

}

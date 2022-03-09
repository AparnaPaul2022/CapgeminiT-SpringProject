package springproject.three.lifecyclemethod.using.reference;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceMainClass {

	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("usingreference.xml");
		Chair chair1=(Chair) context.getBean("chair1");
		System.out.println(chair1);
		context.registerShutdownHook();
	}
}

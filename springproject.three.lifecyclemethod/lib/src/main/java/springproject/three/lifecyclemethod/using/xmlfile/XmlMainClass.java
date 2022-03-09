package springproject.three.lifecyclemethod.using.xmlfile;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("usingxmlfile.xml");
		
		
		Table table1=(Table) context.getBean("table1");
		
		System.out.println(table1);
		context.registerShutdownHook();
		
	}

}

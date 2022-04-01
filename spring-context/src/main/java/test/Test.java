package test;

import mypropertyeditor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author zhuling
 * @Description
 * @create 2022-02-28 17:47
 */
// 使用注解必须要注明需要扫面哪些包
@ComponentScan("test")
public class Test {

	public static void main(String[] args) {
		// 使用xml的方式注册bean并获取
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//读取bean.xml中的内容
//		ApplicationContext ctx = new MyClassPathXmlApplicationContext("bean.xml");
		Person person = (Person)ctx.getBean("person");
		Leg leg = (Leg)ctx.getBean("leg");
		System.out.println(person.toString());
		System.out.println(leg.toString());
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//读取bean.xml中的内容
//		Person p1 = ctx.getBean("person",Person.class);//创建bean的引用对象
//		p1.info();

		// 使用注解的方式注册bean并获取
//		ApplicationContext test = new AnnotationConfigApplicationContext("test");
//		Person p2 = (Person) test.getBean("person");
//		p2.setLeg(new Leg(1));
//		p2.info();
	}
}

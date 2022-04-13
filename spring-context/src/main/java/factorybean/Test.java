package factorybean;

import mypropertyeditor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

/**
 * @author zhuling
 * @Description
 * @create 2022-02-28 17:47
 */
// 使用注解必须要注明需要扫面哪些包
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean4.xml");//读取bean.xml中的内容
		Person bean = (Person)ctx.getBean("&myFactoryBean");
		System.out.println(bean);
//		Person bean1 = ctx.getBean(Person.class);
//		System.out.println(bean1);
	}
}

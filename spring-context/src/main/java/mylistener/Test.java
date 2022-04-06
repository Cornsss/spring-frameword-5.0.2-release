package mylistener;

import mypropertyeditor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Leg;

/**
 * @author zhuling
 * @Description
 * @create 2022-02-28 17:47
 */
// 使用注解必须要注明需要扫面哪些包
public class Test {

	public static void main(String[] args) {
		// 使用xml的方式注册bean并获取
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");//读取bean.xml中的内容
		MyTestEvent myTestEvent = new MyTestEvent("hello", "listener starting...");
		ctx.publishEvent(myTestEvent);
	}
}

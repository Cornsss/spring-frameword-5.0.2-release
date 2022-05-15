package supply;

import hasInstantiationAwareBeanPostProcessors.MyInstantialPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-08 17:22
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean7.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user.getUserName());
	}
}

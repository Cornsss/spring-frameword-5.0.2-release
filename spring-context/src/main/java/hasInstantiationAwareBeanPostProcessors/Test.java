package hasInstantiationAwareBeanPostProcessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import overrideMethod.FruitPlate;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-08 17:22
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean6.xml");
		MyInstantialPostProcessor myInstantialPostProcessor = (MyInstantialPostProcessor) ac.getBean("myInstantialPostProcessor");
		myInstantialPostProcessor.doSth();
	}
}

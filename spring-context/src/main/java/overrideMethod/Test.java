package overrideMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-08 17:22
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean5.xml");
		FruitPlate fruitPlate1 = (FruitPlate) ac.getBean("fruitPlate1");
		System.out.println(fruitPlate1.getFruit());
		FruitPlate fruitPlate2 = (FruitPlate) ac.getBean("fruitPlate2");
		System.out.println(fruitPlate2.getFruit());
	}
}

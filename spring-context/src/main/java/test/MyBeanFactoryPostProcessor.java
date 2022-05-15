package test;

import mypropertyeditor.Address;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhuling
 * @Description bd的增强类：在bd初始化之前对bd进行修改的扩展类
 * @create 2022-03-30 14:36
 */
//@Component
//@Order(80)
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("3. BFPP----MyBeanFactoryPostProcessor.postProcessBeanFactory");
		BeanDefinition person = beanFactory.getBeanDefinition("person");
		MutablePropertyValues propertyValues = person.getPropertyValues();
		if (propertyValues.contains("name")) {
			propertyValues.add("name", "test1111");
		}
	}
}

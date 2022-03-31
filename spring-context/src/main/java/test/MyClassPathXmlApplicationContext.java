package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author zhuling
 * @Description 测试扩展点
 * 1. {@link org.springframework.context.ApplicationContext} initPropertySources
 * 2. {@link org.springframework.context.support.AbstractRefreshableApplicationContext} customizeBeanFactory
 * @create 2022-03-04 10:43
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configs) {
		super(configs);
	}

	protected void initPropertySources() {
		System.out.println("MyClassPathXmlApplicationContext.initPropertySources");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}
}

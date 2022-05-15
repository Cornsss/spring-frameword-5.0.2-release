package test;

import mypropertyeditor.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-30 17:21
 */
@Component
@Order(100)
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("2. BDRPP-----MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("1. BDRPP-----MyBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");
		// 在这里新增一个bd
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Leg.class);
		beanDefinitionBuilder.addPropertyValue("nums", 10);
		registry.registerBeanDefinition("leg", beanDefinitionBuilder.getBeanDefinition());
	}
}

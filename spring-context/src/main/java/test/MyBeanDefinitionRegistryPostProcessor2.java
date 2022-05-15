package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-30 17:21
 */
@Component
@Order(80)
public class MyBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("2. BDRPP-----MyBeanDefinitionRegistryPostProcessor2.postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("1. BDRPP-----MyBeanDefinitionRegistryPostProcessor2.postProcessBeanDefinitionRegistry");
	}
}

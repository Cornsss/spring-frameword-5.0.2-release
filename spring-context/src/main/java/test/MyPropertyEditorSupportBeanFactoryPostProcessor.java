package test;

import mypropertyeditor.DatePropertyEditorRegistrar;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;

/**
 * @author zhuling
 * @Description 自定义bean后置增强类
 * @create 2022-03-02 17:41
 */
public class MyPropertyEditorSupportBeanFactoryPostProcessor extends CustomEditorConfigurer {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition person = beanFactory.getBeanDefinition("person");
		System.out.println("MyPropertyEditorSupportBeanFactoryPostProcessor.postProcessBeanFactory");
		PropertyEditorRegistrar[] propertyEditorRegistrars = new PropertyEditorRegistrar[0];
		propertyEditorRegistrars[0] = new DatePropertyEditorRegistrar();
		setPropertyEditorRegistrars(propertyEditorRegistrars);
	}

}

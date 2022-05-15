package supply;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author zhuling
 * @Description 把生成user对象的supplier设置到bd中
 * @create 2022-04-13 15:03
 */
public class CreateUserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) user;
		genericBeanDefinition.setInstanceSupplier(CreateUserSupplier::getUser);
	}
}

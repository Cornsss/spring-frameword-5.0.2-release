package hasInstantiationAwareBeanPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-12 16:58
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
		if (beanClass == MyInstantialPostProcessor.class) {
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new MyInstantialInterceptor());
			MyInstantialPostProcessor myInstantialPostProcessor = (MyInstantialPostProcessor) enhancer.create();
			return myInstantialPostProcessor;
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}
}

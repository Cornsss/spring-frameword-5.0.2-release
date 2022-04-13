package hasInstantiationAwareBeanPostProcessors;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author zhuling
 * @Description
 * @create 2022-04-12 17:01
 */
public class MyInstantialInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标对象执行前：" + method);
		Object invoke = methodProxy.invokeSuper(o, objects);
		System.out.println("目标对象执行后：" + method);
		return invoke;
	}
}

package mylistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhuling
 * @Description 自定义事件监听器
 * @create 2022-04-06 13:54
 */
public class MyTestListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof MyTestEvent){
			MyTestEvent myTestEvent = (MyTestEvent) event;
			myTestEvent.print();
		}
	}
}

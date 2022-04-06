package mylistener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @author zhuling
 * @Description 自定义事件
 * @create 2022-04-06 13:54
 */
public class MyTestEvent extends ApplicationEvent {

	public String msg;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyTestEvent(Object source) {
		super(source);
	}

	public MyTestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print() {
		System.out.println(msg);
	}
}

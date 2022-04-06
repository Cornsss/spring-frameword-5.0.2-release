package observer;

/**
 * @author zhuling
 * @Description
 * 被观察者接口
 * @create 2022-04-06 9:52
 */
public interface Observable {
	void add(Observer observer);

	void del(Observer observer);
}

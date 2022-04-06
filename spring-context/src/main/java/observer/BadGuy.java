package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-06 9:54
 */
public class BadGuy implements Observable{

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void del(Observer observer) {
		observers.remove(observer);
	}

	public void run() {
		System.out.println("bad guy is running...");
		for (Observer observer : observers) {
			observer.doSomething("chasing...");
		}
	}
}
